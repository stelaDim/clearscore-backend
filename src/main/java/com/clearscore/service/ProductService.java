package com.clearscore.service;

import com.clearscore.model.products.CardCategory;
import com.clearscore.model.products.CardType;
import com.clearscore.model.products.CreditCard;
import com.clearscore.model.products.Loan;
import com.clearscore.util.FileUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductService {

 private List<CreditCard> cardData;
 private List<Loan> loansData;

  public ProductService() {
    this.cardData = loadCardsData();
    this.loansData = loadLoansData();
  }

  public List<CreditCard> getAllCreditCards() {
    return new ArrayList<>(cardData);
  }

  public Optional<CreditCard> findCardWithId(int id) {
    for (CreditCard card : cardData) {
      if (card.getId() == id) {
        return Optional.of(card);
      }
    }
    return Optional.empty();
  }

  private List loadCardsData() {
    List<CreditCard> creditCards = new ArrayList<>();
    List<String> lines = FileUtils.readLines("data/cards.csv");

    lines.remove(0);

    for (String line : lines) {
      String[] columns = line.split(",");

      CreditCard card = new CreditCard();
      card.setId(convertId(columns[0]));
      card.setIssuer((columns[1]));
      card.setName((columns[2]));
      card.setType(convertType(columns[3]));
      card.setApr(convertApr(columns[4]));
      card.setCategories(getCardCategories(columns[5], columns[6], columns[7]));
      card.setUrl(columns[8]);

      creditCards.add(card);

    }
    return creditCards;
  }

  private int convertId(String ID) {
    return Integer.valueOf(ID);
  }

  private List<CardCategory> getCardCategories(String cashback, String lowInterest, String reward) {
    List<CardCategory> categories = new ArrayList<>();

    if (Boolean.valueOf(cashback)) {
      categories.add(CardCategory.CASHBACK);
    }

    if (Boolean.valueOf(lowInterest)) {
      categories.add(CardCategory.LOW_INTEREST);
    }

    if (Boolean.valueOf(reward)) {
      categories.add(CardCategory.REWARD);
    }
    return categories;
  }

  private CardType convertType(String type) {
    switch (type) {
      case "Visa": return CardType.VISA;
      case "Mastercard": return CardType.MASTERCARD;
      case "American Express": return CardType.AMERICAN_EXPRESS;
      default: return CardType.VISA;
    }
  }

  private double convertApr(String ID) {
    return Double.valueOf(ID);
  }


   public List<Loan> getAllLoans() {
     return new ArrayList<>(loansData);
   }
   public Optional<Loan> findLoanWithId(int id) {
     for (Loan loan : loansData) {
       if (loan.getId() == id) {
         return Optional.of(loan);
       }
     }
     return Optional.empty();
   }

   private List<Loan> loadLoansData() {
     List<Loan> loans = new ArrayList<>();
     List<String> lines1 = FileUtils.readLines("data/loans.csv");
     lines1.remove(0);

     for (String line1 : lines1) {
       String[] column = line1.split(",");
       Loan loan = new Loan();
       loan.setId(convertId(column[0]));
       loan.setLender((column[1]));
       loan.setApr(convertApr(column[2]));
       loan.setUrl((column[3]));

       loans.add(loan);
     }
     return loans;
   }
}






package com.clearscore.service;

import com.clearscore.model.products.CreditCard;
import com.clearscore.model.products.Loan;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

/**
 * Created by Stela Dimitrova on 10/07/2017.
 */
public class ProductServiceTest {

    ProductService service = new ProductService();

    @Test
    public void testProduct() {
        List<Loan> loans = service.getAllLoans();
        System.out.println(loans.size());
        Assert.assertEquals(20, loans.size());
    }


    @Test
    public void testCards() {
        List<CreditCard> cards = service.getAllCreditCards();
        System.out.println(cards.size());
    }
    @Test
    public void testData(){
        Optional<CreditCard> cards = service.findCardWithId(4);
    }
}

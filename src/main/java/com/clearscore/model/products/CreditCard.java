package com.clearscore.model.products;

import java.util.List;

public class CreditCard  {
  private int id;
  private String issuer;
  private String name;
  private List<CardCategory> categories;
  private CardType type;
  private double apr;
  private String url;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<CardCategory> getCategories() {
    return categories;
  }

  public void setCategories(List<CardCategory> categories) {
    this.categories = categories;
  }

  public CardType getType() {
    return type;
  }

  public void setType(CardType type) {
    this.type = type;
  }

  public double getApr() {
    return apr;
  }

  public void setApr(double apr) {
    this.apr = apr;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}

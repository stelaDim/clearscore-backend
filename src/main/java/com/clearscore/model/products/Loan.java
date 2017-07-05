package com.clearscore.model.products;

public class Loan {
  private int id;
  private String lender;
  private double apr;
  private String url;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLender() {
    return lender;
  }

  public void setLender(String lender) {
    this.lender = lender;
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

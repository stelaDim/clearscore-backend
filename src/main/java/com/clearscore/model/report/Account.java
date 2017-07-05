package com.clearscore.model.report;

import java.time.LocalDate;
import java.util.Optional;

public class Account {
  private int reportId;
  private String accountNumber;
  private LocalDate dateOpened;
  private Optional<LocalDate> dateClosed;
  private AccountType type;
  private int productId;
  private int currentBalance;
  private int creditLimit;
  private int duration;

  public int getReportId() {
    return reportId;
  }

  public void setReportId(int reportId) {
    this.reportId = reportId;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public LocalDate getDateOpened() {
    return dateOpened;
  }

  public void setDateOpened(LocalDate dateOpened) {
    this.dateOpened = dateOpened;
  }

  public Optional<LocalDate> getDateClosed() {
    return dateClosed;
  }

  public void setDateClosed(Optional<LocalDate> dateClosed) {
    this.dateClosed = dateClosed;
  }

  public AccountType getType() {
    return type;
  }

  public void setType(AccountType type) {
    this.type = type;
  }

  public int getProductId() {
    return productId;
  }

  public void setProductId(int productId) {
    this.productId = productId;
  }

  public int getCurrentBalance() {
    return currentBalance;
  }

  public void setCurrentBalance(int currentBalance) {
    this.currentBalance = currentBalance;
  }

  public int getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(int creditLimit) {
    this.creditLimit = creditLimit;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }
}

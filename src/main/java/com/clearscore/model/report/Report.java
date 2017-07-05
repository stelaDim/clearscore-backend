package com.clearscore.model.report;

import java.time.LocalDate;
import java.util.List;

public class Report {
  private String reportId;
  private int userId;
  private LocalDate date;
  private int creditScore;
  private List<Account> accounts;

  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public int getCreditScore() {
    return creditScore;
  }

  public void setCreditScore(int creditScore) {
    this.creditScore = creditScore;
  }

  public List<Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }
}

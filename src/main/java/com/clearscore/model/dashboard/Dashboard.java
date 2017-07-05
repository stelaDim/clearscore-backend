package com.clearscore.model.dashboard;

public class Dashboard {
  private int creditScore;
  private String bandDescription;
  private int currentShortTermDebt;
  private int currentShortTermCreditLimit;
  private int currentLongTermDebt;

  public int getCreditScore() {
    return creditScore;
  }

  public void setCreditScore(int creditScore) {
    this.creditScore = creditScore;
  }

  public String getBandDescription() {
    return bandDescription;
  }

  public void setBandDescription(String bandDescription) {
    this.bandDescription = bandDescription;
  }

  public int getCurrentShortTermDebt() {
    return currentShortTermDebt;
  }

  public void setCurrentShortTermDebt(int currentShortTermDebt) {
    this.currentShortTermDebt = currentShortTermDebt;
  }

  public int getCurrentShortTermCreditLimit() {
    return currentShortTermCreditLimit;
  }

  public void setCurrentShortTermCreditLimit(int currentShortTermCreditLimit) {
    this.currentShortTermCreditLimit = currentShortTermCreditLimit;
  }

  public int getCurrentLongTermDebt() {
    return currentLongTermDebt;
  }

  public void setCurrentLongTermDebt(int currentLongTermDebt) {
    this.currentLongTermDebt = currentLongTermDebt;
  }
}

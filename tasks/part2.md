# Part 2 -  Reports & Accounts

## Report Data

The file `data/reports.csv` contains the credit-report data for all users. 

1. Add a method to `ReportService` that reads in each line of the data file and creates a `Report` object.

## Account Data

Each report has a number of accounts associated with it. An account represents either a credit-card, loan, bank-account or mortgage. 

The account data is stored in `data/accounts.csv` as is formatted as follows:

* The first two letters of the account number identify the type of the account (`CR` for credit-card, `BA` for bank-account, `LO` for loan and `MO` for mortgage)
* The account is considered open, unless a `date_closed` is present.
* For loan and credit-card products, a `product_id` may be supplied, which will link back to a credit-card or loan product.

1. Expand the method created above to import all the associated account data for each report. 
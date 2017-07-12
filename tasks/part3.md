#Part 3 - Dashboard

1. Write the code to return a `Dashboard` for a particular user. The dashboard data is composed of:

    * A `credit score` which is the score from the user's most recent report. Always a number between 0 and 700.
    * A textual description of the score (0 - 200: 'Poor'; 201 - 300: 'OK'; 301-400: 'Good'; 401+ : 'Great')
    * The `short term debt` which is the total amount owed on all credit-card and loan products according to the user's most recent report.
    * The `short term credit` the total credit-limit for all card and loan products
    * the `long term debt` which is the total balance of any mortgages
        
2. Add a new method to the `DashboardService` class which calculates the average credit score for all users.
# Part 1 -  Products
Implement the methods in the `ProductService` class.

The files `data/cards.csv` and `data/loans.csv` contain credit-card and loan product data respectively. 
 
1. Implement the `getAllCreditCards` method in` ProductService`. 
The method should read in all credit-card records and convert them to `CreditCard` objects. Refer to the `UserService` class, 
which demonstrates how to read in and process data from a file.

2. Write a unit-test to test the `getAllCreditCards` method. See the `UserServiceTest` class for an example of a unit-test.
3. Repeat the above, but this time for loan data, i.e. write the necessary code to implement the `getAllLoans` method.
4. Implement `findLoanWithId` and `findCardWithId`. The methods should return a single loan or credit-card product which which matches the supplied id.
If no product is found, return an empty value.
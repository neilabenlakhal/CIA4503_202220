/*
In this example, we have defined a custom exception called "InsufficientFundsException". 
This exception will be thrown when a user tries to withdraw an amount of money
that is greater than their available balance. 
The exception class has a constructor that takes the amount of money that was attempted
to be withdrawn, and a getter method that returns this value.
In this example, we have defined a simple bank account class that has a balance
and a method to withdraw money. If the amount being withdrawn is greater than the balance
, an instance of the "InsufficientFundsException" is thrown, 
indicating that the user does not have sufficient funds to complete the transaction.


 */
package hct.ae.exception_review;

/**
 *
 * @author nlakhal
 */
public class BankAccount {
   private double balance;
   
   public BankAccount(double balance) {
      this.balance = balance;
   }
   
   public void withdraw(double amount) throws InsufficientFundsException {
      if (amount > balance) {
         throw new InsufficientFundsException(amount - balance);
      }
      balance -= amount;
   }
}

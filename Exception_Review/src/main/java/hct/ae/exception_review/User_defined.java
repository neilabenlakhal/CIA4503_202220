/*
 In Java, you can also create your own custom exceptions by
extending the "Exception" class or one of its subclasses. 
This is useful when you want to create a specific type of exception 
for a particular error condition in your application.

Here's an example of how to create a user-defined exception in Java:
 */
package hct.ae.exception_review;
/**
 *
 * @author nlakhal
 */

class InsufficientFundsException extends Exception {
   private double amount;
   
   public InsufficientFundsException(double amount) {
      this.amount = amount;
   }
   
   public double getAmount() {
      return amount;
   }
}


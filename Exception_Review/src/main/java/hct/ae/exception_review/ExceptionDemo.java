/*

Exception handling in Java is a mechanism for handling runtime errors in a program.
It enables a programmer to handle runtime errors and to provide a meaningful error message to the user. 
This helps to ensure that the application continues to run smoothly even if unexpected errors occur.

Steps   to implement exception handling in Java:

Step 1 
Identify the error: Determine the type of error that may occur in your program,
such as dividing by zero, trying to access an array index that is out of bounds, etc.

Step 2
Use try-catch blocks: Wrap the code that may throw an exception within a try block.
Then, use a catch block to handle the exception if it occurs. 
The syntax of a try-catch block is as follows:

try {
  // code that may throw an exception
} catch (ExceptionType e) {
  // code to handle the exception
}
Step 3
Throw an exception: You can throw an exception in your code by using the "throw" keyword,
followed by a new instance of an exception class. 

For example:
if (divisor == 0) {
  throw new ArithmeticException("Cannot divide by zero");
}

Step 4
Provide a meaningful error message: In the catch block, 
you can provide a meaningful error message to the user, 
which can help to diagnose the problem and to correct it. 

 */

package hct.ae.exception_review;

/**
 * @author nlakhal
 */


public class ExceptionDemo {
   public static void main(String[] args) {
      int dividend = 10, divisor = 0, result;
      // catch and handle JAVA pre-defined exception
      try {
         result = dividend / divisor;
         System.out.println("Result: " + result);
      } catch (ArithmeticException e) {
         System.out.println("Error: " + e.getMessage());
      }
      
      
      
      //catch and handle user-defined exception 
      //Bank acocunt example 
      
      BankAccount account = new BankAccount(100.0);
      
      try {
         account.withdraw(200.0);
      } catch (InsufficientFundsException e) {
         System.out.println("Error: Insufficient funds. You are short by " + e.getAmount());
      }
      
      
      
      
      
   }
}


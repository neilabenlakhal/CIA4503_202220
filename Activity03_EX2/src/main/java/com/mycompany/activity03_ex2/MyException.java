/*
 * Create your own exception class using the extends keyword. 
Write a constructor for this class that takes a String argument and stores it inside the object with
a String reference. Write a method that prints out the stored String. 
Create a try-catch clause to exercise your new exception.
 */

package com.mycompany.activity03_ex2;

/**
 *
 * @author nlakhal
 */
public class MyException extends Exception {

    private final String message;
        
        public MyException(String msg) {
           message = msg;
        }
        public void showMessage() {
            System.out.println(message);
        }
    
  
}


               
    

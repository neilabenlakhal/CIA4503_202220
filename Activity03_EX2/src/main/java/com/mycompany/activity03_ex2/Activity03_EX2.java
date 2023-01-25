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


public class Activity03_EX2 {

      public static void main(String[] args) {
        try {
            String justAMessage = "I am the message of the Exception!";
            throw new MyException(justAMessage);
        } catch (MyException e) {
            e.showMessage();
        }
    }
}

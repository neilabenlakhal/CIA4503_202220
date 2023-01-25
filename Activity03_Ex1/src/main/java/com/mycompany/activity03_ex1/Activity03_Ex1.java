
package com.mycompany.activity03_ex1;

/**
 *
 * @author nlakhal
 * 
 * Create a class with a main( ) that throws an object of class Exception inside a try block. 
 * Give the constructor for Exception a String argument. Catch the exception inside a
 * catch clause and print the String argument. Add a finally clause and print a message to prove you were there.
 * 
 */
public class Activity03_Ex1 {

 public static void main(String[] args) {
        try {
            String msg = "This is Exercise 1 of  Activity  03";
            throw new Exception(msg);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I am in  finally block ");
        }      
        
        
    }
}

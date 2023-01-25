

package com.mycompany.week3;

/**
 *
 * @author nlakhal
 */
public class Week3 {

    public static void main(String[] args)  {
        
        try {
            int a=0; 
            int b = 20, c = 0;     
            a = b/c;
            System.out.println("Division: " + a);  //this instruction will not be executed when exception is raised
             //all instructions after the line where the exception was raised will not be executed
            
       }
        catch (ArithmeticException e) {
            System.out.println("division by 0 not allowed");  
            System.out.println (e.getMessage()); //Display the exception message
        }
    }
}



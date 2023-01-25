/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example;

/**
 *
 * @author nlakhal
 */
class Example
{
   public static void main(String args[]) {
      try{  
	 int num=121/0;  
	 System.out.println(num);  
      }  
      catch(ArithmeticException e){
         System.out.println("Number should not be divided by zero");
      }  
      /* Finally block will always execute
       * even if there is no exception in try block
       */
      finally{
	 System.out.println("This is finally block");
      }  
      System.out.println("Out of try-catch-finally");  
   }   
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.throws_demo;

/**
 *
 * this kind of exception is unchecked and we would like a specific message
 * trying to access a DB without admin privileges,  terminate the program
 * 
 * @author nlakhal
 */
public class Throws_demo {

     public static void main(String[] args)  {
       
        boolean  noAdminRight = true ;
        
         try {
             if (noAdminRight) {
                 // System.out.println("Not allowed to access HERE if you do not have Admin rights");
                 // System.out.println("Must terminate the program and not reach these instructions...");
                 
                 throw new ArithmeticException("Not allowed to access, terminate now !");
             }
         } catch (ArithmeticException e) {
             System.out.println(e.getMessage());
         }
        
           
           
           
           
        
        }
}
        
        
        
   

package com.mycompany.student;

/*
  */

/**
 *
 * @author nlakhal
 */
   public class AtRiskStudentException extends Exception {

    public AtRiskStudentException(String message) {
        super(message);
    }
   
   public void display (){
       
       System.out.println("this.message");
   }
   
   
   
   }


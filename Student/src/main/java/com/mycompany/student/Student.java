/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student;

/**
 *
 * @author nlakhal
 */
public class Student {

    private String fullName;
    private double CGPA;
 

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
    
     public static void main(String[] args) {
       
        Student myStudent = new Student("bob", 1.5);
        
         try {
             if (myStudent.CGPA < 2.0) {
                 
                 throw new AtRiskStudentException("The student cannot add more than 4 courses");
                 
             }
         } catch (AtRiskStudentException e) {
             System.out.println(e.getMessage());
         }
         finally {
         
             System.out.println("Exception raised, tthis messag will bbe shown in all scenarios");
         }
            
         
        
    }

    public Student(String fullName, double CGPA) {
        this.fullName = fullName;
        this.CGPA = CGPA;
    }
    
 
}
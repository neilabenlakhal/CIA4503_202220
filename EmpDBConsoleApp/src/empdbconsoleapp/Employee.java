package empdbconsoleapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nlakhal
 */
public class Employee {
    private String empId;
    private String empName;
    private String empDept;
    private double basicSalary;
    
    public Employee(String id, String name, String dept, double basic) {
        empId = id;
        empName = name;
        empDept = dept;
        basicSalary = basic;
    }
    
    public String toString() {
        return empId + " " + empName + " " + empDept + " " +basicSalary;
    }
    
    public String getEmpId() {
        return empId;
    }
    
    public String getEmpName() {
        return empName;
    }
    
    public String getEmpDept() {
        return empDept;
    }
    
    public double getBasicSalary() {
        return basicSalary;
    }
}

package empdbconsoleapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import empdbconsoleapp.Employee;
import empdbconsoleapp.DBConnection;
import java.sql.*;
import java.util.*;

/**
 *
 * @author nlakhal
 */
public class EmployeeDAO {
    public Employee findEmployeeById(String empId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement(); 
        
        String querySQL = "SELECT * FROM EMPLOYEE WHERE empId='" +empId+"';";
        ResultSet rs = stmt.executeQuery(querySQL);
       
        Employee employee = null;
        
        if (rs.next()) {
            String empName = rs.getString("EMPNAME");
            String empDept = rs.getString("EMPDEPT");
            double basicSalary = rs.getDouble("BASIC_SALARY");
            //put the data from the resultset into an Employee Object
            employee = new Employee(empId, empName, empDept, basicSalary);
        }   
        
        //close result set, statement and the connection to the database
        stmt.close();rs.close();
        conn.close();
        
        return employee;
    }
    
    
    public int addNewEmployee(String empId, String name, String dept, double basicSalary)  throws SQLException {
        Connection conn = DBConnection.getConnection();
        String insertSQL = "INSERT INTO EMPLOYEE VALUES('"+empId+"','" +name+ "','"+ dept+"'," + basicSalary+");";
        System.out.println(insertSQL);
        Statement stmt = conn.createStatement();
        int insertStatus = stmt.executeUpdate(insertSQL);
        stmt.close();
        conn.close();
        return insertStatus;
    }
    
    /*
        Update employee record by empId
    */
    public int updateEmployee(String empId, String name, String dept, double basicSalary)  throws SQLException {
        Connection conn = DBConnection.getConnection();
        String updateSQL = "UPDATE EMPLOYEE SET empname ='"+name+"',empdept = '"+ dept+"',basic_salary=" + basicSalary+" WHERE empId='"+empId+"';";
        System.out.println(updateSQL);
        Statement stmt = conn.createStatement();
        int updateStatus = stmt.executeUpdate(updateSQL);
        stmt.close();
        conn.close();
        return updateStatus;
    }
    
    public int deleteEmployee(String empId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String deleteSQL = "DELETE FROM EMPLOYEE WHERE empId=?;";
        System.out.println(deleteSQL);
        PreparedStatement pstmt = conn.prepareStatement(deleteSQL);
        pstmt.setString(1, empId);
        int deleteStatus = pstmt.executeUpdate();
        pstmt.close();
        conn.close();
        return deleteStatus;
    }

    
    public List<Employee> getAllEmployees() throws SQLException {
        String sql = "SELECT * FROM EMPLOYEE";
        
        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        Employee employee;
        List<Employee> empList = new ArrayList<>();
        while(rs.next()) {
            String empId = rs.getString("EMPID");
            String empName = rs.getString("EMPNAME");
            String empDept = rs.getString("EMPDEPT");
            double basicSalary = rs.getDouble("BASIC_SALARY");
            
            //put the data from the resultset into an Employee Object
            employee = new Employee(empId, empName, empDept, basicSalary);
            
            //add employee to the empList
            empList.add(employee);
        }
        
        //close all the db resources
        rs.close();
        stmt.close();
        conn.close();
        
        return empList;
    }
    

    public List<Employee> searchEmployeeByName(String empName) throws SQLException {
    String sql = "SELECT * FROM employee WHERE empname LIKE ?";
    try (Connection conn = DBConnection.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, "%" + empName + "%"); 
        //% wildcards are used to match any number of characters before and after the search string.
        ResultSet rs = pstmt.executeQuery();
        List<Employee> employees = new ArrayList<>();
        while (rs.next()) {
            Employee employee = new Employee(rs.getString("EMPID"), rs.getString("EMPNAME"),
                    rs.getString("EMPDEPT"), rs.getDouble("BASIC_SALARY"));
            employees.add(employee);
        }
        return employees;
    }
}

} //end EmployeeDAO class


/*
 /*
 /*
 Here are the general steps for developing a Java application using JDBC with NetBeans:

1- Create a new project:  use JAVA with Ant to be able to manage librairies 
Open NetBeans and create a new Java application project. Choose a project name and location.

2- Add the JDBC driver to the project: 
Download the JDBC driver for your DBMS and add it to your project's classpath. 
To do this, right-click on the project name in the Projects window, choose Properties, and then click on the Libraries tab.
Click on the Add JAR/Folder button and select the JDBC driver JAR file.

3- Create a database connection: 
In the Services window, expand the Databases node and right-click on the Drivers node. 
Choose New Connection and follow the prompts to create a new database connection. 
You will need to provide the database URL, username, and password.

4- Design the user interface: 
Create the user interface for your application by adding forms, buttons, labels, and other components as needed. 
NetBeans provides a GUI designer tool that makes this process easy.

5- Create a data source: Use the Palette to add a Data Source component to your form. 
In the Data Source Configuration wizard, select the database connection you created earlier and
choose the table(s) you want to work with.

6-Create the code: Write the Java code that will interact with the database.
This may involve creating SQL statements, executing queries, and processing results.
You can use the Data Source component to simplify this process by automatically generating the code for you.

7-Test the application: Run the application and test its functionality. You can use the Preview button in the GUI designer
to preview the application without running it.

8- Deploy the application: Once you are satisfied with the application, deploy it to a production environment. 
You may need to create a distribution package and/or configure a server to host the application.

9- NetBeans provides many tools and features that simplify the development process when using JDBC.
By following these general steps, you can quickly create a Java application that interacts with a relational database using JDBC
 */
package empdbconsoleapp;

/**
 *
 * @author nlakhal
 */
import java.util.List;
import java.util.Scanner;
import java.sql.SQLException;

/**
 * This is the app main class
 * It uses the EmployeeDAO class to get the data from the database
 * @author tkamal
 */
public class EmpDBConsoleApp {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeDAO empDAO = new EmployeeDAO();
    
    //Application main
    public static void main(String[] args) throws SQLException {
        String choice = "";
        while(!choice.equals("6")) {
            System.out.println("""
                               Employee Database System
                               ========================
                               1. Add a new employee
                               2. Delete employee
                               3. Update employee
                               4. Find employee by ID
                               5. Show All Employee
                               6. Exit
                               Enter your choice:
                               """);
            choice = scanner.nextLine();
            switch(choice) {
                case "1" -> doAddNewEmployee();
                case "2" -> doDeleteEmployee();
                case "3" -> doUpdateEmployee();
                case "4" -> doFindEmployeeByID();
                case "5" -> doShowAllEmployees();
                case "6" -> System.exit(0);
               // case "7" -> doSearchEmployeeByName();
                default -> 
                    System.out.println("Enter a choice between 1 to 6!");
            }
        }
    }

    public static void doFindEmployeeByID() throws SQLException {
        System.out.println("Enter employee to find (ID):");
        String empId = scanner.nextLine();
        Employee employee = empDAO.findEmployeeById(empId);
        if (employee != null) {
            System.out.println(employee);
        }
        else {
            System.out.println("No employee with ID:" +empId);
        }
    }
    
    public static void doAddNewEmployee() throws SQLException {
        System.out.println("Enter new employee ID:");
        String empId = scanner.nextLine();
        
        System.out.println("Enter new employee name:");
        String empName = scanner.nextLine();
        
        System.out.println("Enter new employee department:");
        String empDept = scanner.nextLine();
        
        System.out.println("Enter new employee basic salary:");
        double basicSalary = scanner.nextDouble();
       
        int addStatus = empDAO.addNewEmployee(empId, empName, empDept, basicSalary);
        if (addStatus == 1) {
            System.out.println(empId + " " +empName+ " Added successfully");
        }
        else {
            System.out.println("Error adding new employee " + empId + " "+empName);
        }
    }
    


    public static void doUpdateEmployee() throws SQLException {
        System.out.println("Enter employee ID to update:");
        String empId = scanner.nextLine();
        
        if (empDAO.findEmployeeById(empId) == null) {
            System.out.println("No employee with id:" +empId);
            return;
        }
        
        System.out.println("Enter new employee name:");
        String empName = scanner.nextLine();
        
        System.out.println("Enter new department:");
        String empDept = scanner.nextLine();
        
        System.out.println("Enter new employee basic salary:");
        double basicSalary = scanner.nextDouble();
       
        int updateStatus = empDAO.updateEmployee(empId, empName, empDept, basicSalary);
        if (updateStatus == 1) {
            System.out.println(empId + " " +empName+ " updated successfully");
        }
        else {
            System.out.println("Error updating " + empId + " "+empName);
        }
    }

    public static void doDeleteEmployee() throws SQLException {
        System.out.println("Enter employee ID to delete:");
        String empId = scanner.nextLine();
        
        if (empDAO.findEmployeeById(empId) == null) {
            System.out.println("No employee with id:" +empId);
            return;
        }
       
        int delStatus = empDAO.deleteEmployee(empId);
        if (delStatus == 1) {
            System.out.println(empId + " deleted successfully");
        }
        else {
            System.out.println("Error deleting employee " + empId);
        }
    }
    

    public static void doShowAllEmployees() throws SQLException {
        //get all employees using the DAO
        List<Employee> empList = empDAO.getAllEmployees();
        
        //iterate over the empList and print 
        for (Employee employee : empList) {
            System.out.println(employee);
        }
    }
    
    public static void doSearchEmployeeByName() throws SQLException {
        System.out.println("Enter employee name to search:");
        String empName = scanner.nextLine();
        List<Employee> employees = empDAO.searchEmployeeByName(empName);
        if (!employees.isEmpty()) {
            System.out.println("Employees matching '" + empName + "':");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
        else {
            System.out.println("No employees found with name containing '" + empName + "'");
        }
    }
    
}

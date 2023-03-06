/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package programsmanagementapp;

import edu.programsmanagementapp.dao.CourseDAO;
import edu.programsmanagementapp.dao.ProgramDAO;
import edu.programsmanagementapp.model.Course;
import edu.programsmanagementapp.model.Program;
import java.util.Scanner;
import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author nlakhal
 */


/**
 * This is the app main class
 * It uses the ProgramDAO and CourseDAO classes to get the data from the database
 * @author [Your Name]
 
public class ProgramsManagementApp {
    static Scanner scanner = new Scanner(System.in);
    static ProgramDAO programDAO = new ProgramDAO();
    static CourseDAO courseDAO = new CourseDAO();
    
    //Application main
    public static void main(String[] args) throws SQLException {
        String choice = "";
        while(!choice.equals("6")) {
            System.out.println("""
                                           Course Management System
                                           ========================
                                           1. Add a new course
                                           2. Delete course
                                           3. Update course
                                           4. Find course by code
                                           5. Show all courses
                                           6. Exit
                                           Enter your choice:
                                           """);
            choice = scanner.nextLine();
            switch(choice) {
                case "1" -> doAddNewCourse();
                //case "2" -> doDeleteCourse();
                case "3" -> doUpdateCourse();
                case "4" -> doFindCourseByCode();
                //case "5" -> doShowAllCourses();
                case "6" -> System.exit(0);
                default ->
                    System.out.println("Enter a choice between 1 to 6!");
            }
        }
    }
    
    public static void doFindCourseByCode() throws SQLException {
        System.out.println("Enter course code to find:");
        String courseCode = scanner.nextLine();
        Course course = courseDAO.findCourseByCode(courseCode);
        if (course != null) {
            System.out.println(course);
        }
        else {
            System.out.println("No course with code:" +courseCode);
        }
    }
    
    public static void doAddNewCourse() throws SQLException {
        System.out.println("Enter new course code:");
        String courseCode = scanner.nextLine();
        
        System.out.println("Enter new course title:");
        String courseTitle = scanner.nextLine();
        
        System.out.println("Enter new course credits:");
        int credits = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter new course program code:");
        String programCode = scanner.nextLine();
        
        int addStatus = courseDAO.addNewCourse(courseCode, courseTitle, credits, programCode);
        if (addStatus == 1) {
            System.out.println(courseCode + " " +courseTitle+ " added successfully");
        }
        else {
            System.out.println("Error adding new course " + courseCode + " "+courseTitle);
        }
    }
    
    
    
    public static void doUpdateCourse() throws SQLException {
        System.out.println("Enter course code to update:");
        String courseCode = scanner.nextLine();
        
        if (courseDAO.findCourseByCode(courseCode) == null) {
            System.out.println("No course with code:" +courseCode);
            return;
        }
        
        System.out.println("Enter new course title:");
        String courseTitle = scanner.nextLine();
        
        System.out.println("Enter new course credits:");
        int credits = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter new course program code:");
        String programCode = scanner.nextLine();
        
        int updateStatus = courseDAO.updateCourse(courseCode, courseTitle, credits, programCode);
        if (updateStatus == 1) {
            System.out.println(courseCode + " " +courseTitle+ " updated successfully");
        }
        else {
            System.out.println("Error updating " + courseCode + " "+courseTitle);
        }
    }
}


*/
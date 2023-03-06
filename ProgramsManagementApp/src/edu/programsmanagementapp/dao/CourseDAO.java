/*
 
prepared statement vs statement
-------------------------------------------------
When a standard statement is executed, the SQL query is sent to the database server as a string,
and the server must parse and compile it every time it is executed. 

In contrast, a prepared statement is compiled only once, and its compiled form is cached on the database server. 
When the prepared statement is executed, the server only needs to bind the parameters and execute
the precompiled statement, which can be much faster for repeated executions of the same query.


 */
package edu.programsmanagementapp.dao;

import edu.programsmanagementapp.model.Course;
import edu.programsmanagementapp.model.Program;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDAO {

    public Course findCourseByCode(String code) throws SQLException {

        Connection connection = DBConnection.getConnection();  //step 1 

        Course course = null;
        String sql = "SELECT * FROM course WHERE code = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, code);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                course = new Course();
                course.setCode(rs.getString("code"));
                course.setTitle(rs.getString("title"));
                course.setCredits(rs.getInt("credits"));
                Program program = new Program();
                program.setCode(rs.getString("program_code"));
                course.setProgram(program);
            }
        }
        return course;
    }

    public List<Course> getAllCourses() throws SQLException {
        Connection connection = DBConnection.getConnection();  //step 1 

        List<Course> courses = new ArrayList<>();
        String sql = "SELECT * FROM course";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Course course = new Course();
                course.setCode(rs.getString("code"));
                course.setTitle(rs.getString("title"));
                course.setCredits(rs.getInt("credits"));
                Program program = new Program();
                program.setCode(rs.getString("program_code"));
                course.setProgram(program);
                courses.add(course);
            }
        }
        return courses;
    }

    public List<Course> getAllCourses(String progCode) throws SQLException {
        Connection connection = DBConnection.getConnection();  //step 1 

        List<Course> courses = new ArrayList<>();
        String sql = "SELECT * FROM course WHERE program_code = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, progCode);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Course course = new Course();
                course.setCode(rs.getString("code"));
                course.setTitle(rs.getString("title"));
                course.setCredits(rs.getInt("credits"));
                Program program = new Program();
                program.setCode(rs.getString("program_code"));
                course.setProgram(program);
                courses.add(course);
            }
        }
        return courses;
    }

    public int addNewCourse(String code, String title, int credits, String progCode) throws SQLException {
        Connection connection = DBConnection.getConnection();  //step 1 

        String sql = "INSERT INTO course(code, title, credits, program_code) VALUES (?, ?, ?, ?)";

        /*  an SQL statement is defined as a string, which
          inserts a new row into the course table with the given parameters. 
          The SQL statement uses placeholders represented by question marks (?) to indicate
           where the actual values will be bound later.
         */
 /* the method prepares the statement by calling connection.prepareStatement(sql), 
         which returns a PreparedStatement object. 
         The PreparedStatement object is used to execute the SQL statement and 
        allows parameter binding for efficient execution.
       
        The method then sets the values for the parameters of the prepared statement by 
        calling the setString and setInt methods on the statement object, 
        passing in the parameter index and the corresponding value.

        Finally, the method executes the statement using stmt.executeUpdate(), 
        which returns the number of rows affected by the insert statement. 
        The try-with-resources block automatically closes the PreparedStatement object and releases any resources used.
         */
        
 /* In a PreparedStatement object, the setString method is used to bind a string value 
 to a specific parameter index in a parameterized SQL statement. 
 The index represents the position of the parameter in the statement, starting from 1.
 
 In a parameterized SQL statement, placeholders are represented by question marks (?), 
 and each placeholder represents a parameter that must be bound to a value before 
 the statement can be executed. For example, the following parameterized SQL statement has four placeholders:
 
 INSERT INTO my_table (column1, column2, column3, column4) VALUES (?, ?, ?, ?)
 
 PreparedStatement pstmt = conn.prepareStatement("INSERT INTO my_table (column1, column2, column3, column4) VALUES (?, ?, ?, ?)");
 pstmt.setString(1, "value1");
 pstmt.setString(2, "value2");
 pstmt.setString(3, "value3");
 pstmt.setString(4, "value4");
 pstmt.executeUpdate();
 */

 
 int rowsAffected;
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, code);
            stmt.setString(2, title);
            stmt.setInt(3, credits);
            stmt.setString(4, progCode);
            rowsAffected = stmt.executeUpdate();
        }
        return rowsAffected;
    }

    
    //addCourse with standard statement 
    
    public static int addNewCourse_standard(String code, String title, int credits, String progCode) throws SQLException {
    Connection connection = DBConnection.getConnection();  //step 1 

    String sql = "INSERT INTO course(code, title, credits, program_code) VALUES " +
                 "('" + code + "', '" + title + "', " + credits + ", '" + progCode + "')";
    Statement stmt = connection.createStatement();
    int rowsAffected = stmt.executeUpdate(sql);

    return rowsAffected;
}
/* stmt.executeUpdate(sql) is a method in the Statement interface of JDBC that executes 
 the given SQL statement and returns the number of rows affected by the operation. 
 In the example code you provided, it is used to execute the SQL query that inserts
 a new row into the course table, and it returns the number of rows that were inserted, 
  which is then stored in the rowsAffected variable.

The executeUpdate() method can be used to execute SQL statements that modify
the data in the database, such as INSERT, UPDATE, and DELETE statements. 
It returns an integer value that represents the number of rows affected by the operation, 
or 0 if the statement did not affect any rows.
   */ 
    
    public int updateCourse(String code, String title, int credits, String progCode) throws SQLException {
        Connection connection = DBConnection.getConnection();  //step 1 

        String sql = "UPDATE course SET title = ?, credits = ?, program_code = ? WHERE code = ?";
        int rowsAffected;
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, title);
            stmt.setInt(2, credits);
            stmt.setString(3, progCode);
            stmt.setString(4, code);
            rowsAffected = stmt.executeUpdate();
        }
        return rowsAffected;
    }

    public int deleteCourse(String code) throws SQLException {
        Connection connection = DBConnection.getConnection();  //step 1 

        String sql = "DELETE FROM course WHERE code = ?";
        int rowsAffected;
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, code);
            rowsAffected = stmt.executeUpdate();
        }
        return rowsAffected;
    }

}

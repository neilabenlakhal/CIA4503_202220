/*

A JDBC program comprises the following FIVE steps:

STEP 1: Allocate a Connection object, for connecting to the database server.
STEP 2: Allocate a Statement object, under the Connection created earlier, for holding a SQL command.
STEP 3: Write a SQL query and execute the query, via the Statement and Connection created.
STEP 4: Process the query result.
STEP 5: Close the Statement and Connection to free up the resources.


 */
package edu.programsmanagementapp.dao;

/*
 * @author nlakhal
 */
import edu.programsmanagementapp.model.Program;

import java.sql.*;      //// Using 'Connection', 'Statement' and 'ResultSet' classes in java.sql package
import java.util.ArrayList;
import java.util.List;

public class ProgramDAO {

    public Program findProgramByCode(String code) throws SQLException {
        Connection connection = DBConnection.getConnection();
        // Step 1: Construct a database 'Connection' object called 'connection'

        // Step 2: Construct a 'Statement' object called 'statement' inside the Connection created
        // Step 3: Write a SQL query string.
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM Program WHERE code = ?");
        statement.setString(1, code);

        ResultSet resultSet;
        resultSet = statement.executeQuery();
// Step 4: Execute the SQL query via the 'Statement'.
//  The query result is returned in a 'ResultSet' object called 'resultSet'.

        if (resultSet.next()) {

            // Step 5: Process the 'ResultSet' by scrolling the cursor forward via next().
            //  For each row, retrieve the contents of the cells with getXxx(columnName).   
            // resultSet.next() inside the whole-loop repeatedly moves the cursor to the next row.
            // It returns false if no more rows.   
            Program program = new Program(
                    resultSet.getString("code"),
                    //  For each row, retrieve the contents of the cells with getXxx(columnName).   
                    //getString() to retrieve a String row, getDouble for a row of type double, getInt for a row of type Int
                    resultSet.getString("title"),
                    resultSet.getString("accreditation")
            );

            //close result set, statement and the connection to the database
            statement.close();
            resultSet.close();  //step 6  close the statment 
            connection.close(); //step 7 clost the connexions

            return program;
        }

        return null;
    }

    /*
    public Program findProgramByTitle(String title) throws SQLException {
        Connection connection = DBConnection.getConnection();  //step 1 
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM Program WHERE title = ?");
        statement.setString(1, title);

        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            Program program = new Program(
                    resultSet.getString("code"),
                    resultSet.getString("title"),
                    resultSet.getString("accreditation")
            );

            return program;
        }

        return null;
    }
     */
    
    public ArrayList<Program> findProgramsByTitle(String title) throws SQLException {
    Connection connection = DBConnection.getConnection();
    PreparedStatement statement = connection.prepareStatement("SELECT * FROM Program WHERE title = ?");
    statement.setString(1, title);

    ResultSet resultSet = statement.executeQuery();

    ArrayList<Program> programs = new ArrayList<>();

    while (resultSet.next()) {
        Program program = new Program(
                resultSet.getString("code"),
                resultSet.getString("title"),
                resultSet.getString("accreditation")
        );

        programs.add(program);
    }

    return programs;
}

    
    
    
    
    /* public List<Program> findProgramByTitle(String title) throws SQLException {
    
    String sql = "SELECT * FROM PROGRAM WHERE TITLE LIKE ?";
    
    try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
    
    pstmt.setString(1, "%" + title + "%");
    
    //% wildcards are used to match any number of characters before and after the search string.
    ResultSet rs = pstmt.executeQuery();
    
    List<Program> programS = new ArrayList<>();
    
    while (rs.next()) {
    
    Program program = new Program(rs.getString("CODE"), rs.getString("TITLE"),
    rs.getString("ACCREDITATION"));
    
    programS.add(program);
    
    }
    
    return programS;
    
    }
    
    }*/

    public List<Program> findProgramsByAccreditation(String accreditation) throws SQLException {
        Connection connection = DBConnection.getConnection();  //step 1 
        List<Program> programs = new ArrayList<>();

        PreparedStatement statement = connection.prepareStatement("SELECT * FROM Program WHERE accreditation = ?");
        statement.setString(1, accreditation);

        ResultSet resultSet = statement.executeQuery();

        //The while-loop issue resultSet.next() repeatedly to move the cursor to the next row, and processes row-by-row.
//The resultSet.next() returns false at the last row of the ResultSet, which terminates the while-loop.
//You could use rset.getString(columnName) to retrieve all types (int, double, etc).
//For maximum portability, ResultSet columns within each row should be read in left-to-right order,
//and each column should be read only once via the getXxx() methods. Issue getXxx() 
//to a cell more than once may trigger a strange error. 
        while (resultSet.next()) {
            Program program = new Program(
                    resultSet.getString("code"),
                    resultSet.getString("title"),
                    resultSet.getString("accreditation")
            );

            programs.add(program);
        }

        return programs;
    }

    public List<Program> getAllPrograms() throws SQLException {
        Connection connection = DBConnection.getConnection();  //step 1 
        List<Program> programs = new ArrayList<>();

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM Program");

        while (resultSet.next()) {
            Program program = new Program(
                    resultSet.getString("code"),
                    resultSet.getString("title"),
                    resultSet.getString("accreditation")
            );

            programs.add(program);
        }

        return programs;
    }

    public int addNewProgram(String code, String title, String accreditation) throws SQLException {
        Connection connection = DBConnection.getConnection();  //step 1 
        PreparedStatement statement = connection.prepareStatement("INSERT INTO Program (code, title, accreditation) VALUES (?, ?, ?)");
        statement.setString(1, code);
        statement.setString(2, title);
        statement.setString(3, accreditation);

        return statement.executeUpdate();
    }

    public int updateProgram(String code, String title, String accreditation) throws SQLException {
        Connection connection = DBConnection.getConnection();  //step 1 
        PreparedStatement statement = connection.prepareStatement("UPDATE Program SET title = ?, accreditation = ? WHERE code = ?");
        statement.setString(1, title);
        statement.setString(2, accreditation);
        statement.setString(3, code);
        connection.close();

        return statement.executeUpdate();
    }

    public int deleteProgram(String code) throws SQLException {
        Connection connection = DBConnection.getConnection();  //step 1 
        PreparedStatement statement = connection.prepareStatement("DELETE FROM Program WHERE code = ?");
        statement.setString(1, code);

        connection.close();
        return statement.executeUpdate();
    }
}

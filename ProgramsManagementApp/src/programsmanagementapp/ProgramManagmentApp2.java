/*

 */
package programsmanagementapp;

import edu.programsmanagementapp.dao.CourseDAO;
import edu.programsmanagementapp.dao.ProgramDAO;
import edu.programsmanagementapp.model.Course;
import edu.programsmanagementapp.model.Program;
import java.util.Scanner;
import java.util.List;
import java.sql.SQLException;

import edu.programsmanagementapp.dao.ProgramDAO;
import java.util.ArrayList;

/**
 *
 * @author nlakhal
 */
public class ProgramManagmentApp2 {

    public static void main(String[] args) throws SQLException {
        String programCode = "CIB";
        ProgramDAO programDAO = new ProgramDAO();

        Program program = programDAO.findProgramByCode(programCode);
        if (program != null) {
            System.out.println("Program Code: " + program.getCode());
            System.out.println("Program Title: " + program.getTitle());
            System.out.println("Accreditation: " + program.getAccreditation());
        } else {
            System.out.println("Program with code " + programCode + " not found.");
        }

        String programTitle = "SECURITY AND FORENSICS";
        ArrayList<Program> programs = programDAO.findProgramsByTitle(programTitle);

        if (programs != null) {

            for (int i = 0; i < programs.size(); i++) {
                System.out.println("Program Code: " + programs.get(i).getCode());
                System.out.println("Program Title: " + programs.get(i).getTitle());
                System.out.println("Accreditation: " + programs.get(i).getAccreditation());
            }

        } else {

            System.out.println("Program with code " + programTitle + " not found.");

        }

        //testing find programs by title 
        try {
            // Call the findProgramsByTitle method
            ArrayList<Program> programsbyTitle = programDAO.findProgramsByTitle("Business Solutions");
            if (programsbyTitle != null && !programsbyTitle.isEmpty()) {
                for (int i = 0; i < programsbyTitle.size(); i++) {
                    Program program_instance = programsbyTitle.get(i);
                    System.out.println("Program Code: " + program_instance.getCode());
                    System.out.println("Program Title: " + program_instance.getTitle());
                    System.out.println("Program Accreditation: " + program_instance.getAccreditation());
                    System.out.println();
                }
            } else {
                System.out.println("No programs found with the given title.");
            }

        } catch (SQLException ex) {
            System.out.println("An error occurred: " + ex.getMessage());

        }
    }
}

/*
List<Program> is an interface in Java that defines a collection of elements of type Program
. It is a generic interface, which means that you can specify what type of elements
you want to store in the list when you create an object of the List interface. 
However, you cannot create an object of List directly because it is an interface and not a concrete class.

ArrayList<Program> is a concrete class in Java that implements the List interface. 
It is a type of dynamic array that can grow or shrink in size as needed.
When you create an ArrayList object with elements of type Program, 
you are creating a resizable array that can store objects of the Program class.

So, in summary, List<Program> is just an interface that defines a collection 
of elements of type Program, while ArrayList<Program> is a concrete class 
that implements the List interface and provides the functionality of a 
dynamic array that can store objects of the Program class.

 */

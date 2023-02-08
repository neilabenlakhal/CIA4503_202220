/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hct.ae.activity05_ex2;

/**
 *
 * @author nlakhal
 */
public class CourseTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Program myProgram = new Program("IT", "CAA");
        Course myCourse = new Course("CIA4503", myProgram);
        
        Course clonedCourse = (Course) myCourse.clone();
        System.out.println("Cloned course program accreditation before the change of the original is " + clonedCourse.getProgram().getAccredited());
        
        myProgram.setAccreditation("ABET");
        System.out.println("Cloned course program accreditation after the change of the original is " + clonedCourse.getProgram().getAccredited());
  
        System.out.println("original  course program accreditation after the change  " + myCourse.getProgram().getAccredited());
    
    }
}

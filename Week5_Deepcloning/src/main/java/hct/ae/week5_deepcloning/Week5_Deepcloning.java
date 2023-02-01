/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hct.ae.week5_deepcloning;

/**
 *
 * @author nlakhal
 */
public class Week5_Deepcloning {

    public static void main(String[] args) throws CloneNotSupportedException {
       
Department dept = new Department(1, "Human Resource");
 Employee original = new Employee(1, "Admin", dept);        
 
  //Lets create a clone of original object
        Employee cloned = (Employee) original.clone();

        System.out.println(original);
        System.out.println(cloned);

        //Let verify using employee id, if cloning actually workded
        System.out.println("Cloned employee ID is :" + cloned.getEmpoyeeId());
        System.out.println("original  employee ID is :" + original.getEmpoyeeId());

        //Must be true and objects must have different memory addresses
        System.out.println("Is the clone an exact copy of the object ?  " + (original != cloned));


//Let change the department name in cloned object and we will verify in original object
System.out.println("Clone employee  dep before change  :  "+cloned.getDepartment().getName());
System.out.println("Original employee dep before change  :   "+original.getDepartment().getName());

cloned.getDepartment().setName("Finance");      
System.out.println("Original employee dep After  change done with clone:   "+original.getDepartment().getName());
System.out.println("Clone employee  dep After  change  :  "+cloned.getDepartment().getName());

/*Deep cloning or deep copying : In the deep copy, we create a clone that is independent 
of the original object and making changes in the cloned object should not affect the original object.*/

 
 
 
    }
}

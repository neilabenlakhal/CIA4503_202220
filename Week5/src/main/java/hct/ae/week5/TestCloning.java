/*
 *  Cloning ?

What is Cloning
Cloning an object refers to creating a copy of the object. 
Given an object,  you want to create multiple objects which are ‘exact’ copies of that object, 
but do not want to go through the process of defining a new object instance.


2 types : 

Shallow cloning : creating 2 references to the same object 
deep cloning : create a totally independant clone (replicat of an object)  , 
it also creates copies of the nested object hirerarchy inside the object being cloned.

How to do it ?

step 1 : We must implement Cloneable interface (Marker interface) : To say that you would like to be able to clone your class
step 2 : We must override clone() method from Object class.

Default behavior of the clone() method  is shallow cloning.

What is the Cloneable interface ?

 */
package hct.ae.week5;

/**
 *
 * @author nlakhal
 */
public class TestCloning {

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
System.out.println("cloned employee dep After  change done with clone:   "+cloned.getDepartment().getName());















    }
}

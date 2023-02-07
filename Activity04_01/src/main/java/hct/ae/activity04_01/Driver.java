/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hct.ae.activity04_01;

/**
 * * Array and ArrayList are two commonly used data structures in Java for storing collections of data. 
 * However, there are some significant differences between the two.

* 
 * @author nlakhal
 */
import java.util.ArrayList;
import java.util.Date;

public class Driver {
   public static void main(String[] args) {
       
/*Arrays in Java are fixed-sized data structures. This means that once you create an array, you cannot change its size.
Arrays are best suited for cases where you know the exact size of the data you need to store ahead of time.
Accessing elements in an array is fast and efficient.
 */       
   
      // Example of an Array
   
       int[] numbers = new int[5];
numbers[0] = 1;
numbers[1] = 2;
numbers[2] = 3;
numbers[3] = 4;
numbers[4] = 5;
//numbers[7] = "3";

/*     ArrayList:

ArrayList, is a dynamic data structure that automatically grows and shrinks as you add or remove elements.
ArrayList is best suited for cases where you don't know the exact size of the data you need to store
or if you need to store elements of different data types.
ArrayList is less efficient than arrays when it comes to accessing elements because
it needs to dynamically resize itself when elements are added or removed.
*/
       
ArrayList<Integer> list_numbers = new ArrayList<>();
list_numbers.add(1);
list_numbers.add(2);
list_numbers.add(3);
list_numbers.add(4);
list_numbers.add(5);

System.out.println("Size of ArrayList: " + list_numbers.size()); // outputs "Size of ArrayList: 

list_numbers.remove(1); // remove the second element, which has an index of 1

list_numbers.remove(Integer.valueOf(3)); // remove the element with the value 3

System.out.println("Size of ArrayList: " + list_numbers.size()); // outputs "Size of ArrayList after modif : 3

 for (int i = 0; i < list_numbers.size(); i++) {
  System.out.println(list_numbers.get(i));
}      
       
 //----------------------------------------------------------------------------------------------------------------------------------------------
 
 
      ArrayList<Person> personList = new ArrayList<>();

      Person p = new Person("Dina", new Date());
      Employee e = new Employee("Sarah", new Date(), "E2007", 5000);

      personList.add(p); // notice that we can add objects from different types to the Arraylist
      personList.add(e);

      for (Person person : personList) {
         System.out.println(person.toString());
      }
   }
}

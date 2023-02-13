/*
 *In Java, both abstract classes and interfaces are used to define a common set 
of methods or behavior that can be shared by multiple classes. However,
there are some important differences between the two.

An abstract class is a class that cannot be instantiated on its own and must be subclassed. 
An abstract class can contain both abstract methods (methods without a body) 
and concrete methods (methods with a body).

Here's an example of an abstract class in Java:
 */

package hct.ae.abstract_interface_review;

/**
 *
 * @author nlakhal
 */
abstract class Shape {
   abstract double area();   //abstract
   
   public void display() {
      System.out.println("Shape display method");  //concrete
   }
}

class Rectangle extends Shape {
   double length;
   double width;
   
   public Rectangle(double length, double width) {
      this.length = length;
      this.width = width;
   }
   
   @Override
   double area() {  //define the body of the method 
      return length * width;
   }
}

class Circle extends Shape {
   double radius;
   
   public Circle(double radius) {
      this.radius = radius;
   }
   
   @Override
   double area() {
      return Math.PI * radius * radius;
   }
}


/*An interface is a collection of abstract methods (methods without a body)
that can be implemented by multiple classes. Unlike an abstract class, 
an interface cannot contain concrete methods or instance variables.
*/


interface Printable {
   void print(); //abstract method
}

class Book implements Printable  {
   String title;
   
   public Book(String title) {
      this.title = title;
   }
   
   @Override
   public void print() {
      System.out.println("Printing book: " + title);
   }
}

class Document implements Printable {
   String fileName;
   
   public Document(String fileName) {
      this.fileName = fileName;
   }
   
   @Override
   public void print() {
      System.out.println("Printing document: " + fileName);
   }
}


/* the difference :

The main difference between abstract classes and interfaces is that an 
abstract class can contain both abstract and concrete methods, 
while an interface can only contain abstract methods. 
Additionally, a class can only extend one abstract class, but it can implement multiple interfaces.

*/

//using abstract and interface at the same time
//use extends keyword before implements

class Rectangle2 extends Shape implements Printable {
   double length;
   double width;
   
   public Rectangle2(double length, double width) {
      this.length = length;
      this.width = width;
   }
   
   @Override
   double area() {  //abstract method from the abstract class
      return length * width;
   }
   
   @Override
   public void print() { //abstract method from the interface
      System.out.println("Printing rectangle with length " + length); 

   }
}

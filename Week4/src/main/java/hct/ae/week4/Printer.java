/*
 In Java, a generic class is a class that is parameterized with a type.
This means that you can create a single class definition that can be used with different types. 
This provides a way to write a single class that can work with multiple data types,
while still providing strong type-checking at compile time. 

The syntax for declaring a generic class in Java is as follows:

class ClassName<T> { 
   T object; 
   ... 
}

Here, T is a type parameter that acts as a placeholder for a specific type 
that the client program will specify when creating an instance of the class. 
When creating an instance of the class, you replace T with a concrete type, such as Integer or String.





 */
package hct.ae.week4;

/**
 * we would like to print an Integer 
 * @author nlakhal
 */
public class Printer <T,P>{   // T stands for a generic  type parameter 
    
    T  thingToPrint;
    P priceThing;

    public Printer(T  thingToPrint, P price) {
        this.thingToPrint = thingToPrint;
        this.priceThing=price;
    }

    public void print(){
        System.out.println(thingToPrint);
        System.out.println(priceThing);
    }
  

    
    
}

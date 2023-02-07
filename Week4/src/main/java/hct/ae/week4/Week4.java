/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hct.ae.week4;

/**
 *
 * @author nlakhal
 */
public class Week4 {

    public static void main(String[] args) {

IntegerPrinter int1 = new IntegerPrinter(20);
        
        int1.print();
        
 StringPrinter string1 = new StringPrinter("twenty");
        
        string1.print();       
        
  // we can define generic types     
  // Tell Java I want a print for Double
  //No need to have different classe, one for each type.
  Printer<Integer,Double>   obj2 = new Printer(10,20.0) ;   
  
  Printer<Double,Double> thing = new Printer(10.5, 10.5);      
        
        thing.print();
        
        
        
        
        
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nlakhal
 */
public class Product {
    private String pName; //attribute
    private  double pPrice; //attribute
    private int pQuantity; //attribute
    
    public double PTotalPrice; //attribute
    
    
    /**
     * @return the pName
     */
    public String getpName() {
        return pName;
    }

    /**
     * @param pName the pName to set
     */
    public void setpName(String pName) {
        this.pName = pName;
    }

    /**
     * @return the pPrice
     */
    public double getpPrice() {
        return pPrice;
    }

    /**
     * @param pPrice the pPrice to set
     */
    public void setpPrice(double pPrice) {
        this.pPrice = pPrice;
    }

    /**
     * @return the pQunatity
     */
    public int getpQuantity() {
        return pQuantity;
    }

    /**
     * @param pQuantity the pQuantity to set
     */
    public void setpQuantity(int pQuantity) {
        this.pQuantity = pQuantity;
    }
   
    // parameter less constructor
   public Product(){
       pName="Java";
       pPrice = 12.0;
       pQuantity = 12;
      PTotalPrice = 100.0;
   }
   //parameterized constructor
    public Product(String name, double price, int quantity, double totalPrice){
       pName=name;
       pPrice = price;
       pQuantity = quantity;
      PTotalPrice = totalPrice;
    }
    
//add method 
    public double totalPrice(){
        double totalPrice;  
        totalPrice = this.pPrice * this.pQuantity;
            
            return totalPrice;
    }
    
//Override totalPrice() to accept two arguments 
//product price and quantity and calculates the total price. 
//add totalPrice with parameters (override)   
    public double totalPrice(double price, int quantity){
        double totalPrice;  
        totalPrice = price * quantity;
            
            return totalPrice;
    }
    
 public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Product p1 = new Product();
        Product p2 = new Product("p2", 100.0, 10, 1000);
        Product p3 = new Product("p3", 100.0, 10, 200);


        
        System.out.println(p1.pName);
        
        //testing method with parameters
        System.out.println(p1.totalPrice());
        System.out.println(p2.totalPrice());
        System.out.println(p3.totalPrice());
        
        System.out.println(p2.getpName());
        


         
        
    }          
    
}



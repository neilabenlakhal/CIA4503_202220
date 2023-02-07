/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ae.hct.week4_userdeginedgenericlassex2;

/**
 *
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create a fridge object where you can add  food:
        //1. food name=milk  initial price=150
        //2. food name=egg initial price 160
        Fridge<Food> myFood=new Fridge<Food>(5);
        myFood.add(new Milk(" milk", 150));
        myFood.add(new Egg(" egg", 160));
        
        //Display all food details of the fridge
        for(int i=0; i<myFood.count();i++ ){
            System.out.println(myFood.get(i).toString());}
        }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nlakhal
 */



public class Activity01_Ex2 {

  public static void main(String[] args) {
     
     
    Circle c1 = new Circle();
    Circle c2 = new Circle(20);
    Circle c3 = new Circle(30, "Green", true);
     
    System.out.println(c2.toString());
    System.out.println(c3.toString());
     
    Rectangle R1 = new Rectangle();
    Rectangle R2 = new Rectangle(20,10);
    Rectangle R3 = new Rectangle(30,10,"Blue",false);
     
    System.out.println(R2.toString());
    System.out.println(R3.toString());
  }
}




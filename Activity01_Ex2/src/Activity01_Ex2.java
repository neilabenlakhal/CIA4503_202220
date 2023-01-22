

/**
 *
 * @author nlakhal
 */


public class Activity01_Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangle r1=new Rectangle(5,10,"blue",false);
        System.out.println(r1.toString());
        System.out.println("Perimeter: "+ r1.getPerimeter());
        System.out.println("Area: "+ r1.getArea());
        
        Circle c1=new Circle(6, "red",true);
        System.out.println(c1.toString());
        
        System.out.println("Perimeter: "+ c1.getPerimeter());
        System.out.println("Area: "+ c1.getArea());
        
    }
    
}




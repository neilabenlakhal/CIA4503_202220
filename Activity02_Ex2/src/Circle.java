

/**
 *
 * @author nlakhal
 */
public class Circle extends GeometricObject{
    
        private double radius;

    /**
     * Get the value of radius
     *
     * @return the value of radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set the value of radius
     *
     * @param radius new value of radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        // use the overloaded constructor of the super class
        super(color, filled);
        //initialize the attribute of the sub class
        this.radius = radius;
    }
    
    public double getDiameter(){
        return 2*radius;
        
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
        
    }
    
    @Override
    public double getPerimeter(){
        return Math.PI*this.getDiameter();
    }

    
//    public String toString() {
//        return super.toString()+ "is a Circle{" + "radius=" + radius + '}';
//    }
//    
    @Override
    public String toString() {
        return "GeometricObject is a Circle{" + "radius="+this.radius  +  "color="  + this.getColor() + ", filled=" + this.isFilled() + '}';
    }
    


    
}
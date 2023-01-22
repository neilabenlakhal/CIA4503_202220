
/**
 *
 * @author nlakhal
 */
public class Rectangle  extends GeometricObject implements Colorable {

    private double width;
    private double height;

    /**
     * Get the value of width
     *
     * @return the value of width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Set the value of width
     *
     * @param width new value of width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Get the value of height
     *
     * @return the value of height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Set the value of height
     *
     * @param height new value of height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

   
    @Override
    public String howToColor(){
        if (this.isFilled()){
            
            return "Color all four sides ans inside the object";
        }
        else 
        {
        return "Color all four sides";
        }
    }
        
    @Override
    public double getArea() {
        return width * height;
    }
   
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return " the Geometric form is a Rectangle{ color = " + this.getColor()+ ",  filled = "+ this.isFilled()+", width=" + width + ", height=" + height+ '}';
    }

}

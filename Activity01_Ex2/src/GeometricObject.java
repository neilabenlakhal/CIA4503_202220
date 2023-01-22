
import java.util.Date;

/**
 *
 * @author nlakhal
 */
abstract class GeometricObject {
    //Attributes

    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    //default Constructor
    protected GeometricObject() {

    }

    //overloaded constructor
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //getters
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the filled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * @param filled the filled to set
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * @return the dateCreated
     */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /**
     * @param dateCreated the dateCreated to set
     */
    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    //none abstract method 
    @Override
    public String toString() {
        return "GeometricObject{" + "color=" + color + ", filled=" + filled + '}';
    }
    

    public abstract double getArea(); //abstract methods -- No Body

    public abstract double getPerimeter(); //abstract method -- No Body

}

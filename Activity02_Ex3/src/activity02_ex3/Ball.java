
package activity02_ex3;

/**
 *
 * @author nlakhal
 */
public abstract class Ball implements Tossable {
    
    private String brandName;
    
   protected Ball()  
// add this pramter -less protected constructor 
// to be able to add this constructor is child class 
   {
   }
   
    protected  Ball(String brandName) {  
        //change the constructor to protected
        //it is a violation to make the constructor public for an abstract class
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public abstract void toss();

   public abstract void bounce();
    
   
    @Override
    public String toString() {
        return "Ball{" + "brandName=" + brandName + '}';
    }
    
   
    
    
}

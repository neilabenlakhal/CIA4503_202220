
package activity02_ex3;

/**
 *
 * @author nlakhal
 */
public class Baseball extends Ball {

   public void bounce(){
       
       System.out.println("The baseball is bouncing");
       
   }
   
   public void toss()
   {
       System.out.print("The baseball is tossing");
   }
   

            
public Baseball (){

}
        
    public Baseball(String brandName){
        super(brandName);
        
        
    }

    @Override
    public String toString() {
        return "Baseball{" +this.getBrandName()+ '}';
    }
    
    
    
    
}

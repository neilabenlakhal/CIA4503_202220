
package ae.hct.week4_userdeginedgenericlassex2;

/**
 *
 */
public class Milk extends Food{
    
   
    

    @Override
    public double getPrice() {
        return super.getPrice()+10;
    }

    

    public Milk(String name, double price) {
        super(name,price);
    }

    @Override
    public String toString() {
        return "Milk{" + "name=" + super.getName()+ ", price=" + this.getPrice() + '}';
    }

    
}

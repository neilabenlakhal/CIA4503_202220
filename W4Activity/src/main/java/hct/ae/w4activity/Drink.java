/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hct.ae.w4activity;

/**
 *
 * @author nlakhal
 */
public class Drink <T,P>{
    private T name;
    private P price;

    public Drink(T name, P price) {
        this.name = name;
        this.price=price;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public P getPrice() {
        return price;
    }

    public void setPrice(P price) {
        this.price = price;
    }
    
    
}

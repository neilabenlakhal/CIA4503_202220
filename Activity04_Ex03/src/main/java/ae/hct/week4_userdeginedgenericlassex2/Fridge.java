package ae.hct.week4_userdeginedgenericlassex2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 */
public class Fridge<T> {
    private Object[] juice;
    private int i;

    public Fridge(int size) {
        this.juice= new Object[size];
        i=0;
    }
  
    public void add(T t){
        this.juice[i++]=t;
    }
    
    public T get(int i){
        return (T)juice[i];
    }
    
    public int count(){
        return this.i;
    }
    

    
    
    
    
    
}

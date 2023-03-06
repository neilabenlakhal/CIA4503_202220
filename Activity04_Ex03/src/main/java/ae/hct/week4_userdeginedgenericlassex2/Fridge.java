package ae.hct.week4_userdeginedgenericlassex2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *what is the difference between      T[] items and Object[] items

In Java, T[] items is a generic array type,
* where T is a type parameter that is determined at runtime when the class is instantiated. 
* The type T can represent any class or interface, and the T[] array can only contain elements of type T.

On the other hand, Object[] items is an array of objects, which means it can hold any object regardless of its type. 
* However, when accessing elements of the Object[] array, 
* the type of the element must be explicitly casted to its original type before it can be used.

In summary, T[] items provides type safety at compile time and runtime, 
* while Object[] items is less restrictive but requires casting at runtime to determine the type of the elements.
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

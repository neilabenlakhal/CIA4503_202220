/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hct.ae.activity05_ex01;

/**
 *
 * @author nlakhal
 */
class Person implements Cloneable {
  private Name name;
  private Address address;

  public Person(Name name, Address address) {
    this.name = name;
    this.address = address;
  }

  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  /*  For the deep  cloning project, the clone() method  and   
  create  new objects with their values. We can do this by directly returning this:*/

  
//    @Override
//	 protected  Object clone() throws CloneNotSupportedException  {  
//		return super.clone();  //all classes are child of the Object class in java
//	}
         
         
         @Override
    public Object clone() throws CloneNotSupportedException {
        Person clonedPerson = (Person) super.clone();
        clonedPerson.name = (Name) name.clone();  // Name class must implement the cloneable class 
        clonedPerson.address = (Address) address.clone(); // same applies here
        return clonedPerson;
    }
         
         
}

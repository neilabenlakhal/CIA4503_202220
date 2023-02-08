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

  /*  For the shallow cloning project, the clone() method of the
  Person class will  only copy the references to the Name and Address objects rather than 
  creating new objects with their values. We can do this by directly returning this:*/

  
    @Override
	 protected  Object clone() throws CloneNotSupportedException  {  
		return super.clone();  //all classes are child of the Object class in java
	}

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + '}';
    }
}

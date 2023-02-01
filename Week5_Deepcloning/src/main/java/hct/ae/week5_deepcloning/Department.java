/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hct.ae.week5_deepcloning;

/**
 *
 * @author nlakhal
 */
/**
 *
 * @author nlakhal
 */
public class Department implements Cloneable 
{
	private int id;
	private String name;

	public Department(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

        @Override
                   protected Object clone() throws CloneNotSupportedException
                   {  return super.clone();
                   
                   }
        
        
	//Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        
        
}
/*
 * 
 */
package hct.ae.week5;

/**
 *
 * @author nlakhal
 */
public class Department
{
	private int id;
	private String name;

	public Department(int id, String name)
	{
		this.id = id;
		this.name = name;
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
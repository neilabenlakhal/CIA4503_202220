/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hct.ae.activity05_ex2;

/**
 *
 * @author nlakhal
 */
public class Program implements Cloneable {
    //attributes
    public String title;
    private String accreditation;
    
    public String getAccredited(){
        return this.accreditation;
    }
    public void setAccreditation(String accreditation){
        this.accreditation=accreditation;
    }
    //constructor
    public Program(String title, String accreditation){
        this.title=title;
        this.accreditation=accreditation;
    }
 
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

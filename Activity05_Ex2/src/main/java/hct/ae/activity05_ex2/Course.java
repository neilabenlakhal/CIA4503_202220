/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hct.ae.activity05_ex2;

/**
 *
 * @author nlakhal
 */
public class Course implements Cloneable {
    public String code;
    private Program program;
    
    public Program getProgram(){
        return this.program;
    }
    public void setProgram(Program program){
        this.program=program;
    }
    
    public Course(String code, Program program){
        this.code=code;
        this.program=program;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Course clonedCourse = (Course) super.clone();
        clonedCourse.program = (Program) program.clone();
        return clonedCourse;
    }
}


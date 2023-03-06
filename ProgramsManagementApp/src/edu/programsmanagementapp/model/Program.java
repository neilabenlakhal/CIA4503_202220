/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.programsmanagementapp.model;

/**
 *
 * @author nlakhal
 */
public class Program {
    private String code;
    private String title;
    private String accreditation; 

    public Program() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Program{" + "code=" + code + ", title=" + title + ", accreditation=" + accreditation + '}';
    }

    public Program(String code, String title, String accreditation) {
        this.code = code;
        this.title = title;
        this.accreditation = accreditation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAccreditation() {
        return accreditation;
    }

    public void setAccreditation(String accreditation) {
        this.accreditation = accreditation;
    }
    
    
}

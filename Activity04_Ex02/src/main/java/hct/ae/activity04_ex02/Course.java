/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hct.ae.activity04_ex02;

/**
 *
 * @author nlakhal
 */
import java.util.ArrayList;

public class Course {
  private String code;
  private String title;
  private int credits;

  public Course(String code, String title, int credits) {
    this.code = code;
    this.title = title;
    this.credits = credits;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getCredits() {
    return credits;
  }

  public void setCredits(int credits) {
    this.credits = credits;
  }

  @Override
  public String toString() {
    return code + ", " + title + ", " + credits + " credits";
  }
}

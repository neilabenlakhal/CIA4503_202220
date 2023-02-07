package hct.ae.activity04_ex02;


/**
 *
 * @author nlakhal
 */
import java.util.ArrayList;

public class Program {
  private String title;
  private String accreditation;
  private ArrayList<Course> courses;

  public Program(String title, String accreditation) {
    this.title = title;
    this.accreditation = accreditation;
    courses = new ArrayList<Course>();
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

  public void addCourse(Course c) {
    courses.add(c);
  }

  public void deleteCourse(Course c) {
    courses.remove(c);
  }

  public void deleteCourse(String courseCode) {
    for (int i = 0; i < courses.size(); i++) {
      Course c = courses.get(i);
      if (c.getCode().equals(courseCode)) {
        courses.remove(i);
        break;
      }
    }
  }

  public int count() {
    return courses.size();
  }

  @Override
  public String toString() {
    String str = title + " program, " + accreditation + " accreditation\n";
    for (int i = 0; i < courses.size(); i++) {
      str += courses.get(i) + "\n";
    }
    return str;
  }
}


package hct.ae.activity04_01;

import java.util.Date;

/**
 *
 * @author nlakhal
 */


public class Person {
   protected String name;
   protected Date birthdate;

   public Person(String name, Date birthdate) {
      this.name = name;
      this.birthdate = birthdate;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Date getBirthdate() {
      return birthdate;
   }

   public void setBirthdate(Date birthdate) {
      this.birthdate = birthdate;
   }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", birthdate=" + birthdate + '}';
    }
   
   
   
   
   
}

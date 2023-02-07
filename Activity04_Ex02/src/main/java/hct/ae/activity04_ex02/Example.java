package hct.ae.activity04_ex02;


/**
 *
 * @author nlakhal
 * 
 * Here's a simple example of how you could define a Java class with an attribute of type ArrayList:

 * In this example, the Example class has a private attribute items of type ArrayList<String>. 
 * The class has a constructor that initializes the items attribute with a new ArrayList object. 
 * There are also methods to add items to the ArrayList, get the count of items in the list, and retrieve the entire list.

 * 
 */
import java.util.ArrayList;

public class Example {
  private ArrayList<String> items;

  public Example() {
    items = new ArrayList<String>();
  }

  public void addItem(String item) {
    items.add(item);
  }

  public int getItemCount() {
    return items.size();
  }

  public ArrayList<String> getItems() {
    return items;
  }
}

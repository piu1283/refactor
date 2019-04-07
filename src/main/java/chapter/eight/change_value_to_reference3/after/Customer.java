package chapter.eight.change_value_to_reference3.after;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Customer {
  private static Dictionary instances = new Hashtable();
  private final String name;

  // This code should be executed at the program launch.
  static void loadCustomers() {
    new Customer("Lemon Car Hire").store();
    new Customer("Associated Coffee Machines").store();
    new Customer("Bilston Gasworks").store();
  }

  private void store() {
    instances.put(this.getName(), this);
  }


  public static Customer getNamed(String name) {
    return (Customer) instances.get(name);
  }
  private Customer(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
}

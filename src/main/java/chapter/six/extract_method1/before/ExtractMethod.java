package chapter.six.extract_method1.before;

import chapter.six.extract_method1.Order;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class ExtractMethod {
  private String name;
  private Vector<Order> orders;

  void printOwing() {
    Enumeration elements = orders.elements();
    double outstanding = 0.0;

    // print banner
    System.out.println("*****************************");
    System.out.println("****** Customer totals ******");
    System.out.println("*****************************");

    // print owings
    while (elements.hasMoreElements()) {
      Order each = (Order) elements.nextElement();
      outstanding += each.getAmount();
    }

    // print details
    System.out.println("name: " + name);
    System.out.println("amount: " + outstanding);
  }
}

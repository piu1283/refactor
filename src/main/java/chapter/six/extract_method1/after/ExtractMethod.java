package chapter.six.extract_method1.after;

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
    printBanner();
    double outstanding = getOutstanding();
    printDetails(outstanding);
  }

  void printBanner() {
    System.out.println("*****************************");
    System.out.println("****** Customer totals ******");
    System.out.println("*****************************");
  }

  void printDetails(double outstanding) {
    System.out.println("name: " + name);
    System.out.println("amount: " + outstanding);
  }

  double getOutstanding() {
    Enumeration elements = orders.elements();
    double outstanding = 0.0;
    while (elements.hasMoreElements()) {
      Order each = (Order) elements.nextElement();
      outstanding += each.getAmount();
    }
    return outstanding;
  }
}

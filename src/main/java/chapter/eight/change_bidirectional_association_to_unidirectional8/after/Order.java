package chapter.eight.change_bidirectional_association_to_unidirectional8.after;

import java.util.Iterator;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Order {
  public Customer getCustomer() {
    Iterator iter = Customer.getInstances().iterator();
    while (iter.hasNext()) {
      Customer each = (Customer)iter.next();
      if (each.containsOrder(this)) {
        return each;
      }
    }
    return null;
  }

  double getDiscountedPrice() {
    return getGrossPrice() * (1 - getCustomer().getDiscount());
  }

  private double getGrossPrice() {
    return 0;
  }
}

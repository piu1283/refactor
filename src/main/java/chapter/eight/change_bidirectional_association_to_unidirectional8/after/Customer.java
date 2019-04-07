package chapter.eight.change_bidirectional_association_to_unidirectional8.after;

import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Customer {
  private Set orders = new HashSet();

  public static List getInstances() {
    return new ArrayList();
  }

  void addOrder(Order arg) {
    orders.add(arg);
  }

  double getPriceFor(Order order) {
    Assert.isTrue(orders.contains(order));
    return order.getDiscountedPrice();
  }

  public int getDiscount() {
    return 0;
  }

  public boolean containsOrder(Order order) {
    return orders.contains(order);
  }
}

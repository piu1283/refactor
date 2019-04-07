package chapter.eight.change_bidirectional_association_to_unidirectional8.before;

import org.springframework.util.Assert;

import java.util.HashSet;
import java.util.Set;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Customer {

  private Set orders = new HashSet();

  // Should be used in Order class only.
  Set friendOrders() {
    return orders;
  }
  void addOrder(Order arg) {
    arg.setCustomer(this);
  }

  double getPriceFor(Order order) {
    Assert.isTrue(orders.contains(order));
    return order.getDiscountedPrice();
  }

  public int getDiscount() {
    return 0;
  }
}

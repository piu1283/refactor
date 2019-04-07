package chapter.eight.change_unidirectional_association_to_bidirectional7.after;

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
}

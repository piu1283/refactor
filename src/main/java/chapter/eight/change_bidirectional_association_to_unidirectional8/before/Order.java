package chapter.eight.change_bidirectional_association_to_unidirectional8.before;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Order {

  private Customer customer;

  public Customer getCustomer() {
    return customer;
  }
  public void setCustomer(Customer arg) {
    // Remove order from old customer.
    if (customer != null) {
      customer.friendOrders().remove(this);
    }
    customer = arg;
    // Add order to new customer.
    if (customer != null) {
      customer.friendOrders().add(this);
    }
  }

  double getDiscountedPrice() {
    return getGrossPrice() * (1 - getCustomer().getDiscount());
  }

  private double getGrossPrice() {
    return 0;
  }
}

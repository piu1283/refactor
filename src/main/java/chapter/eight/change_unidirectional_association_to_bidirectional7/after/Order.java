package chapter.eight.change_unidirectional_association_to_bidirectional7.after;

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
}

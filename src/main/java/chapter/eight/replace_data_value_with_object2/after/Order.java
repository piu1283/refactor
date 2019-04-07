package chapter.eight.replace_data_value_with_object2.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Order {
  private Customer customer;

  public Order(String customerName) {
    this.customer = new Customer(customerName);
  }

  public String getCustomerName() {
    return customer.getName();
  }

  public void setCustomer(String customerName) {
    this.customer = new Customer(customerName);
  }
}

package chapter.eight.change_value_to_reference3.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Order {
  private Customer customer;

  public String getCustomerName() {
    return customer.getName();
  }

  public void setCustomer(String customerName) {
    customer = Customer.getNamed(customerName);
  }

  public Order(String customerName) {
    customer = Customer.getNamed(customerName);
  }
}

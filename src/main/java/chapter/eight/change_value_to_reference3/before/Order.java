package chapter.eight.change_value_to_reference3.before;

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
    customer = new Customer(customerName);
  }

  public Order(String customerName) {
    customer = new Customer(customerName);
  }
}

package chapter.eight.change_unidirectional_association_to_bidirectional7.before;

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
    customer = arg;
  }
}

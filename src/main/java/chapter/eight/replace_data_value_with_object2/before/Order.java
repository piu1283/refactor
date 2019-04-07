package chapter.eight.replace_data_value_with_object2.before;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Order {

  private String customer;

  public Order(String customer) {
    this.customer = customer;
  }
  public String getCustomer() {
    return customer;
  }
  public void setCustomer(String customer) {
    this.customer = customer;
  }
}

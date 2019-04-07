package chapter.eight.change_value_to_reference3.before;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Customer {
  private final String name;

  public Customer(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}

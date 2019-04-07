package chapter.seven.hide_delegate5.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Department {
  private String chargeCode;
  private Person manager;

  public Department(Person manager) {
    this.manager = manager;
  }
  public Person getManager() {
    return manager;
  }
}

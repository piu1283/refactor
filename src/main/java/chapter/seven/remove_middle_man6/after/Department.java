package chapter.seven.remove_middle_man6.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Department {
  private String chargeCode;
  private Person manager;

  public Department(Person arg) {
    manager = arg;
  }
  public Person getManager() {
    return manager;
  }

}

package chapter.eleven.pull_up_constructor_body3.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class Employee {
  protected String name;
  protected String id;

  protected Employee(String name, String id) {
    this.name = name;
    this.id = id;
  }
}

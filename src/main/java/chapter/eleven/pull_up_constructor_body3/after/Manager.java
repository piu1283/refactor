package chapter.eleven.pull_up_constructor_body3.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class Manager extends Employee {
  private int grade;

  public Manager(String name, String id, int grade) {
    super(name, id);
    this.grade = grade;
  }
}

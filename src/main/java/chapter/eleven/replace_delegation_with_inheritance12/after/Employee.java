package chapter.eleven.replace_delegation_with_inheritance12.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class Employee extends Person {
  @Override
  public String toString() {
    return "Emp: " + getLastName();
  }
}

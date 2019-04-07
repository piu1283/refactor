package chapter.eight.replace_type_code_with_subclasses14.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Engineer extends Employee {
  public int getType() {
    return Employee.ENGINEER;
  }
}

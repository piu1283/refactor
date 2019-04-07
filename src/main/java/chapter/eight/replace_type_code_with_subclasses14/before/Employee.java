package chapter.eight.replace_type_code_with_subclasses14.before;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Employee {
  // ...
  static final int ENGINEER = 0;
  static final int SALESMAN = 1;
  static final int MANAGER = 2;

  public int type;

  public Employee(int arg) {
    type = arg;
  }

}

package chapter.ten.replace_constructor_with_factory_method12.before;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Employee {
  private int type;
  static final int ENGINEER = 0;
  static final int SALESMAN = 1;
  static final int MANAGER = 2;

  public Employee(int type) {
    this.type = type;
  }

  public static void main(String[] args) {
    Employee eng = new Employee(Employee.ENGINEER);
  }
}

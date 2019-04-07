package chapter.ten.replace_constructor_with_factory_method12.after;

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

  public Employee() {

  }

  public static Employee create(int type) {
    switch (type) {
      case ENGINEER:
        return new Engineer();
      case SALESMAN:
        return new Salesman();
      case MANAGER:
        return new Manager();
      default:
        return new Employee(type);
    }
  }

  public static void main(String[] args) {
    Employee eng = Employee.create(Employee.ENGINEER);
  }
}

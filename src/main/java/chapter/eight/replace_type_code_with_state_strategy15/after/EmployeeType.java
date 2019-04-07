package chapter.eight.replace_type_code_with_state_strategy15.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public abstract class EmployeeType {
  static final int ENGINEER = 0;
  static final int SALESMAN = 1;
  static final int MANAGER = 2;

  abstract public int getTypeCode();

  public static EmployeeType newType(int code) {
    switch (code) {
      case ENGINEER:
        return new Engineer();
      case SALESMAN:
        return new Salesman();
      case MANAGER:
        return new Manager();
      default:
        throw new IllegalArgumentException("Incorrect Employee Code");
    }
  }

  abstract public int payAmount(Employee employee);
}

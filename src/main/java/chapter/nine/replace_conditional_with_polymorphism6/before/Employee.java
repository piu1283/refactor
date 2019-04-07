package chapter.nine.replace_conditional_with_polymorphism6.before;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class Employee {
  public int monthlySalary;
  public int commission;
  public int bonus;
  private EmployeeType type;

  public int getTypeCode() {
    return type.getTypeCode();
  }

  public int payAmount() {
    switch (getTypeCode()) {
      case EmployeeType.ENGINEER:
        return monthlySalary;
      case EmployeeType.SALESMAN:
        return monthlySalary + commission;
      case EmployeeType.MANAGER:
        return monthlySalary + bonus;
      default:
        throw new RuntimeException("Incorrect Employee Code");
    }
  }
}

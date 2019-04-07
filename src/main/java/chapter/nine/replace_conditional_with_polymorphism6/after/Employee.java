package chapter.nine.replace_conditional_with_polymorphism6.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
class Employee {
  public int monthlySalary;
  public int commission;
  public int bonus;
  private EmployeeType type;

  public int getTypeCode() {
    return type.getTypeCode();
  }

  public int payAmount() {
    return type.payAmount(this);
  }
}

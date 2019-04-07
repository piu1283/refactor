package chapter.eight.replace_type_code_with_state_strategy15.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Employee {

  private EmployeeType type;

  public Employee(int arg) {
    type = EmployeeType.newType(arg);
  }
  public int getTypeCode() {
    return type.getTypeCode();
  }
  public void setTypeCode(int arg) {
    type = EmployeeType.newType(arg);
  }

  public int monthlySalary;
  public int commission;
  public int bonus;

  public int payAmount() {
    return type.payAmount(this);
  }
}

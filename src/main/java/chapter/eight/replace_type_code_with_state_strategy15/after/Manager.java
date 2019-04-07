package chapter.eight.replace_type_code_with_state_strategy15.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Manager extends EmployeeType {
  @Override public int getTypeCode() {
    return EmployeeType.MANAGER;
  }
  @Override public int payAmount(Employee employee) {
    return employee.monthlySalary + employee.bonus;
  }
}

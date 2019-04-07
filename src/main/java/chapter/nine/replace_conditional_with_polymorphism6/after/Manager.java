package chapter.nine.replace_conditional_with_polymorphism6.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
class Manager extends EmployeeType {
  @Override public int getTypeCode() {
    return EmployeeType.MANAGER;
  }
  @Override public int payAmount(Employee employee) {
    return employee.monthlySalary + employee.bonus;
  }
}

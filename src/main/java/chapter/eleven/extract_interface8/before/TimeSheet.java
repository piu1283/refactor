package chapter.eleven.extract_interface8.before;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class TimeSheet {
  public double charge(Employee employee, int days) {
    double base = employee.getRate() * days;
    if (employee.hasSpecialSkill()) {
      return base * 1.05;
    }
    else {
      return base;
    }
  }
}

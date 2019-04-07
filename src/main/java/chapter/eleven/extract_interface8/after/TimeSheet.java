package chapter.eleven.extract_interface8.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class TimeSheet {
  public double charge(Billable emp, int days) {
    int base = emp.getRate() * days;
    if (emp.hasSpecialSkill())
      return base * 1.05;
    else return base;
  }
}

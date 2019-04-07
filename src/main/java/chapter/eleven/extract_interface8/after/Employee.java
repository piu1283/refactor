package chapter.eleven.extract_interface8.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class Employee implements Billable {

  public int getRate() {
    return 0;
  }

  public boolean hasSpecialSkill() {
    return true;
  }
}

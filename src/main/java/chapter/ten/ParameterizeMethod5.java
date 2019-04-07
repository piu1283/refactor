package chapter.ten;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class ParameterizeMethod5 {
  private int salary;

  public void tenPercentRaise() {
    salary *= 1.1;
  }
  public void fivePercentRaise() {
    salary *= 1.05;
  }

  public void raise(double factor) {
    salary *= (1 + factor);
  }
}

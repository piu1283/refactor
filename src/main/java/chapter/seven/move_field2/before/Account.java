package chapter.seven.move_field2.before;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Account {
  private AccountType type;
  private double interestRate;

  public double interestForAmount_days(double amount, int days) {
    return interestRate * amount * days / 365.0;
  }
}

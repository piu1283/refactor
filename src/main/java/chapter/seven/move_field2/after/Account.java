package chapter.seven.move_field2.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Account {
  private AccountType type;

  public double interestForAmount_days(double amount, int days) {
    return getInterestRate() * amount * days / 365.0;
  }

  private double getInterestRate() {
    return type.getInterestRate();
  }
}

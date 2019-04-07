package chapter.seven.move_method1.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class AccountType {
  private boolean isPremium;

  public double overdraftCharge(Account account) {
    if (isPremium()) {
      double result = 10;
      if (account.getDaysOverdrawn() > 7) {
        result += (account.getDaysOverdrawn() - 7) * 0.85;
      }
      return result;
    } else {
      return account.getDaysOverdrawn() * 1.75;
    }
  }

  public boolean isPremium() {
    return isPremium;
  }
}

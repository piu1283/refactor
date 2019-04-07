package chapter.seven.move_method1.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Account {
  private AccountType type;
  private int daysOverdrawn;

  public double bankCharge() {
    double result = 4.5;
    if (daysOverdrawn > 0) {
      result += type.overdraftCharge(this);
    }
    return result;
  }

  public int getDaysOverdrawn() {
    return daysOverdrawn;
  }

  public void setDaysOverdrawn(int daysOverdrawn) {
    this.daysOverdrawn = daysOverdrawn;
  }
}

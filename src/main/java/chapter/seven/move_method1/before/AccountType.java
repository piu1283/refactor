package chapter.seven.move_method1.before;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class AccountType {
  private boolean isPremium;

  public boolean isPremium() {
    return isPremium;
  }

  public void setPremium(boolean premium) {
    isPremium = premium;
  }
}

package chapter.ten.replace_error_code_with_exception14.before;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Account {
  private int balance;

  public Account(int balance) {
    this.balance = balance;
  }

  public int withdraw(int amount) {
    if (amount > balance) {
      return -1;
    } else {
      balance -= amount;
      return 0;
    }
  }

  public static void main(String[] args) {
    Account account = new Account(3);
    if (account.withdraw(1) == -1) {
      // handleOverdrawn();
    } else {
      // doTheUsualThing();
    }
  }
}

package chapter.ten.replace_error_code_with_exception14.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Account {

  private int balance;

  public Account(int balance) {
    this.balance = balance;
  }

  public void withdraw(int amount) throws BalanceException {
    if (amount > balance) {
      throw new BalanceException();
    }
    balance -= amount;
  }

  public static void main(String[] args) {
    Account account = new Account(3);
    try {
      account.withdraw(1);
      //doTheUsualThing();
    } catch (BalanceException e) {
      //handleOverdrawn();
    }
  }
}


class BalanceException extends Exception {
}



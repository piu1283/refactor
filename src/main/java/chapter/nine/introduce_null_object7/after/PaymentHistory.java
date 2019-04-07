package chapter.nine.introduce_null_object7.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class PaymentHistory {
  public boolean isNull() {
    return false;
  }
  public static PaymentHistory newNull() {
    return new NullPaymentHistory();
  }

  public int getWeeksDelinquentInLastYear() {
    return 10;
  }
}

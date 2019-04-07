package chapter.nine.introduce_null_object7.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class NullPaymentHistory extends PaymentHistory {
  @Override public boolean isNull() {
    return true;
  }
  @Override public int getWeeksDelinquentInLastYear() {
    return 0;
  }
}

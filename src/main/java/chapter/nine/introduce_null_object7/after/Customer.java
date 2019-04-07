package chapter.nine.introduce_null_object7.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class Customer {

  public boolean isNull() {
    return false;
  }

  public static Customer newNull() {
    return new NullCustomer();
  }

  public String getName() {
    return "";
  }

  public BillingPlan getPlan() {
    return new BillingPlan();
  }

  public PaymentHistory getHistory() {
    return new PaymentHistory();
  }
}

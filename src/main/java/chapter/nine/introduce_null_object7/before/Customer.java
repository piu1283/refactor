package chapter.nine.introduce_null_object7.before;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class Customer {

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


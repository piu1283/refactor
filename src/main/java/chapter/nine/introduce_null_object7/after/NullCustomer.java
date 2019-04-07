package chapter.nine.introduce_null_object7.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class NullCustomer extends Customer {
  @Override
  public boolean isNull() {
    return true;
  }

  @Override
  public String getName() {
    return "N/A";
  }

  @Override
  public BillingPlan getPlan() {
    return BillingPlan.basic();
  }

  @Override
  public PaymentHistory getHistory() {
    return PaymentHistory.newNull();
  }
}

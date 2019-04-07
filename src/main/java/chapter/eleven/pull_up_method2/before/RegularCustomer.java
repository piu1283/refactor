package chapter.eleven.pull_up_method2.before;

import java.util.Date;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class RegularCustomer extends Customer {
  public void createBill(Date date) {
    Date lastBillDate = new Date();
    double charge = 0;
    double chargeAmount = chargeFor(lastBillDate, date);
    addBill(date, charge);
  }

  private double chargeFor(Date lastBillDate, Date date) {
    return 1;
  }
}

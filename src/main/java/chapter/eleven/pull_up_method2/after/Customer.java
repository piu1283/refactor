package chapter.eleven.pull_up_method2.after;

import java.util.Date;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public abstract class Customer {
  public void addBill(Date date, double charge) {

  }

  public void createBill(Date date) {
    Date lastBillDate = new Date();
    double charge = 0;
    double chargeAmount = chargeFor(lastBillDate, date);
    addBill(date, charge);
  }

  abstract double chargeFor(Date start, Date end);
}

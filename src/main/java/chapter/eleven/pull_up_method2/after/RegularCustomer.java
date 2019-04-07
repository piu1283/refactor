package chapter.eleven.pull_up_method2.after;

import java.util.Date;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class RegularCustomer extends Customer {


  public double chargeFor(Date lastBillDate, Date date) {
    return 1;
  }
}

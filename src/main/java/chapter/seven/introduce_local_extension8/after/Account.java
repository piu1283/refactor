package chapter.seven.introduce_local_extension8.after;

import java.util.Date;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class Account {
  private Date previousDate;

  public void schedulePayment() {
    Date paymentDate = new MfDateSub(previousDate).nextWeek();
  }
}

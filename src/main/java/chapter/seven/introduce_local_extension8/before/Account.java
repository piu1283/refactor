package chapter.seven.introduce_local_extension8.before;

import java.util.Date;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class Account {
  Date previousDate;

  void schedulePayment() {
    Date paymentDate = nextWeek(previousDate);
  }

  /**
   * Foreign method. Should be on Date class.
   */
  private static Date nextWeek(Date arg) {
    return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 7);
  }
}

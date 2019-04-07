package chapter.seven;

import java.util.Date;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class IntroduceForeignMethod7 {
  private Date previousDate;

  public void schedulePayment1() {
    Date paymentDate = new Date(previousDate.getYear(), previousDate.getMonth(), previousDate.getDate() + 7);
  }

  public void schedulePayment2() {
    Date paymentDate = nextWeek(previousDate);
  }

  public static Date nextWeek(Date arg) {
    return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 7);
  }
}

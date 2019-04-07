package chapter.nine;

import java.util.Date;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class DecomposeConditional1 {
  private static final Date SUMMER_START = new Date();
  private double winterRate;
  private double summerRate;
  private double winterServiceCharge;

  public double getCharge(Date date, int quantity) {
    double charge;
    if (date.before(SUMMER_START) || date.after(SUMMER_START)) {
      charge = quantity * winterRate + winterServiceCharge;
    } else {
      charge = quantity * summerRate;
    }
    return charge;
  }

  private boolean notSummer(Date date) {
    return date.before(SUMMER_START) || date.after(SUMMER_START);
  }

  private double summerCharge(int quantity) {
    return quantity * summerRate;
  }

  private double winterCharge(int quantity) {
    return quantity * winterRate + winterServiceCharge;
  }
}

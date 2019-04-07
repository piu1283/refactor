package chapter.seven.introduce_local_extension8.after;

import java.util.Date;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class MfDateSub extends Date {
  public MfDateSub(String dateString) {
    super(dateString);
  }

  public MfDateSub(Date arg) {
    super(arg.getTime());
  }

  public Date nextWeek() {
    return new Date(getYear(), getMonth(), getDate() + 7);
  }
}

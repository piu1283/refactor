package chapter.ten.preserve_whole_object7.before;

import chapter.ten.preserve_whole_object7.TempRange;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class HeatingPlan {
  private TempRange range;
  public boolean withinRange(int low, int high) {
    return (low >= range.getLow() && high <= range.getHigh());
  }
}

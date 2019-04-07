package chapter.ten.preserve_whole_object7.after;

import chapter.ten.preserve_whole_object7.TempRange;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class HeatingPlan {
  private TempRange range;

  public boolean withinRange(Room room) {
    return (room.getLowestTemp() >= range.getLow() && room.getHighestTemp() <= range.getHigh());
  }
}

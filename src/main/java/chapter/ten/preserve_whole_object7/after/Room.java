package chapter.ten.preserve_whole_object7.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class Room {
  public boolean withinPlan(HeatingPlan plan) {
    return plan.withinRange(this);
  }

  public int getHighestTemp() {
    return 0;
  }

  public int getLowestTemp() {
    return 0;
  }
}

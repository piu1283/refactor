package chapter.ten.preserve_whole_object7.before;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class Room {
  public boolean withinPlan(HeatingPlan plan) {
    int low = getLowestTemp();
    int high = getHighestTemp();
    return plan.withinRange(low, high);
  }

  private int getHighestTemp() {
    return 0;
  }

  private int getLowestTemp() {
    return 0;
  }
}

package chapter.six;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class InlineMethod2 {

  private int numberOfLateDeliveries;

  int getRating1() {
    return moreThanFiveLateDeliveries() ? 2 : 1;
  }

  boolean moreThanFiveLateDeliveries() {
    return numberOfLateDeliveries > 5;
  }

  int getRating2() {
    return numberOfLateDeliveries > 5 ? 2 : 1;
  }
}

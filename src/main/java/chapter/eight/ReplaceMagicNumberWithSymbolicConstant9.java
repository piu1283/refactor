package chapter.eight;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class ReplaceMagicNumberWithSymbolicConstant9 {

  private static final double STANDARD_GRAVITY = 9.81;

  double potentialEnergy1(double mass, double height) {
    return mass * 9.81 * height;
  }

  double potentialEnergy2(double mass, double height) {
    return mass * STANDARD_GRAVITY * height;
  }
}

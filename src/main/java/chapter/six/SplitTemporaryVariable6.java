package chapter.six;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class SplitTemporaryVariable6 {
  private double primaryForce;
  private double mass;
  private int delay;
  private double secondaryForce;

  public double getDistanceTravelled1(int time) {
    double result;
    double acc = primaryForce / mass;
    int primaryTime = Math.min(time, delay);
    result = 0.5 * acc * primaryTime * primaryTime;

    int secondaryTime = time - delay;
    if (secondaryTime > 0) {
      double primaryVel = acc * delay;
      acc = (primaryForce + secondaryForce) / mass;
      result += primaryVel * secondaryTime + 0.5 * acc * secondaryTime * secondaryTime;
    }
    return result;
  }

  public double getDistanceTravelled2(int time) {
    double result;
    final double primaryAcceleration = primaryForce / mass;
    int primaryTime = Math.min(time, delay);
    result = 0.5 * primaryAcceleration * primaryTime * primaryTime;

    int secondaryTime = time - delay;
    if (secondaryTime > 0) {
      double primaryVel = primaryAcceleration * delay;
      final double secondaryAcceleration = (primaryForce + secondaryForce) / mass;
      result += primaryVel * secondaryTime + 0.5 * secondaryAcceleration * secondaryTime * secondaryTime;
    }
    return result;
  }
}

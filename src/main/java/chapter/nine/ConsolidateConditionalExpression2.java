package chapter.nine;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class ConsolidateConditionalExpression2 {
  private int seniority;
  private int monthsDisabled;
  private boolean isPartTime;

  public double disabilityAmount() {
    if (seniority < 2) {
      return 0;
    }
    if (monthsDisabled > 12) {
      return 0;
    }
    if (isPartTime) {
      return 0;
    }
    return 0;
  }

  public double disabilityAmount2() {
    if (isNotEligibleForDisability()) {
      return 0;
    }
    return 0;
  }

  public boolean isNotEligibleForDisability() {
    return (seniority < 2) || (monthsDisabled > 12) || (isPartTime);
  }
}

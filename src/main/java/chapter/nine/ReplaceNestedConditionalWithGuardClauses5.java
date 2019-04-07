package chapter.nine;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class ReplaceNestedConditionalWithGuardClauses5 {
  private boolean isDead;
  private boolean isSeparated;
  private boolean isRetired;

  double getPayAmount() {
    double result = 0;
    if (isDead) {
      result = deadAmount();
    } else {
      if (isSeparated) {
        result = separatedAmount();
      } else {
        if (isRetired) {
          result = retiredAmount();
        } else {
          result = normalPayAmount();
        }
      }
    }
    return result;
  }

  double getPayAmount2() {
    if (isDead) {
      return deadAmount();
    }
    if (isSeparated) {
      return separatedAmount();
    }
    if (isRetired) {
      return retiredAmount();
    }
    return normalPayAmount();
  }

  private double deadAmount() {
    return 0;
  }

  private double normalPayAmount() {
    return 0;
  }

  private double retiredAmount() {
    return 0;
  }

  private double separatedAmount() {
    return 0;
  }
}

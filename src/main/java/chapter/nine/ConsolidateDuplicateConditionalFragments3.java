package chapter.nine;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class ConsolidateDuplicateConditionalFragments3 {

  public void calculate(double total, double price) {
    if (isSpecialDeal()) {
      total = price * 0.95;
      send();
    } else {
      total = price * 0.98;
      send();
    }
  }

  public void calculate2(double total, double price) {
    if (isSpecialDeal()) {
      total = price * 0.95;
    } else {
      total = price * 0.98;
    }
    send();
  }

  private void send() {
  }

  private boolean isSpecialDeal() {
    return true;
  }
}

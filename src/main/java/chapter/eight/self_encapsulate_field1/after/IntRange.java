package chapter.eight.self_encapsulate_field1.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class IntRange {
  private int low, high;

  int getLow() {
    return low;
  }

  int getHigh() {
    return high;
  }

  void setLow(int arg) {
    low = arg;
  }

  void setHigh(int arg) {
    high = arg;
  }

  public boolean includes(int arg) {
    return arg >= getLow() && arg <= getHigh();
  }

  public void grow(int factor) {
    setHigh(getHigh() * factor);
  }

  public IntRange(int low, int high) {
    this.low = low;
    this.high = high;
  }
}

package chapter.eight.self_encapsulate_field1.before;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class IntRange {
  private int low, high;

  public IntRange(int low, int high) {
    this.low = low;
    this.high = high;
  }

  public boolean includes(int arg) {
    return arg >= low && arg <= high;
  }
  public void grow(int factor) {
    high = high * factor;
  }

}

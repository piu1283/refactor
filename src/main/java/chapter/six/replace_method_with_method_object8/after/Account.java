package chapter.six.replace_method_with_method_object8.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class Account {
  int gamma(int inputVal, int quantity, int yearToDate) {
    return new Gamma(this, inputVal, quantity, yearToDate).compute();
  }

  public int delta() {
    return 0;
  }
}

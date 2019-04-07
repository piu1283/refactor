package chapter.six.replace_temp_with_query4.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class Product {
  private int quantity;
  private int itemPrice;

  public double getPrice() {
    return basePrice() * discountFactor();
  }
  private int basePrice() {
    return quantity * itemPrice;
  }
  private double discountFactor() {
    if (basePrice() > 1000) {
      return 0.95;
    }
    else {
      return 0.98;
    }
  }
}

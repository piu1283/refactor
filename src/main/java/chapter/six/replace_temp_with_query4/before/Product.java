package chapter.six.replace_temp_with_query4.before;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class Product {
  private int quantity;
  private int itemPrice;

  public double getPrice() {
    int basePrice = quantity * itemPrice;
    double discountFactor;
    if (basePrice > 1000) {
      discountFactor = 0.95;
    } else {
      discountFactor = 0.98;
    }
    return basePrice * discountFactor;
  }
}

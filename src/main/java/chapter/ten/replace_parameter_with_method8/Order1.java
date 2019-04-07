package chapter.ten.replace_parameter_with_method8;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class Order1 {
  private int quantity;
  private int itemPrice;

  public double getPrice() {
    int basePrice = quantity * itemPrice;
    int discountLevel;
    if (quantity > 100) {
      discountLevel = 2;
    } else {
      discountLevel = 1;
    }
    double finalPrice = discountedPrice(basePrice, discountLevel);
    return finalPrice;
  }

  private double discountedPrice(int basePrice, int discountLevel) {
    if (discountLevel == 2) {
      return basePrice * 0.1;
    } else {
      return basePrice * 0.05;
    }
  }
}

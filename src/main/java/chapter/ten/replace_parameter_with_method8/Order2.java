package chapter.ten.replace_parameter_with_method8;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class Order2 {
  private int quantity;
  private int itemPrice;

  public double getPrice() {
    return discountedPrice();
  }

  private double discountedPrice() {
    if (getDiscountLevel() == 2) {
      return getBasePrice() * 0.1;
    } else {
      return getBasePrice() * 0.05;
    }
  }

  private int getDiscountLevel() {
    if (quantity > 100) {
      return 2;
    } else {
      return 1;
    }
  }

  private double getBasePrice() {
    return quantity * itemPrice;
  }
}

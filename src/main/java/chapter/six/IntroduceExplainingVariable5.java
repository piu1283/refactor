package chapter.six;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class IntroduceExplainingVariable5 {
  private double quantity;
  private double itemPrice;

  public double price1() {
    // price is base price - quantity discount + shipping
    return quantity * itemPrice -
        Math.max(0, quantity - 500) * itemPrice * 0.05 +
        Math.min(quantity * itemPrice * 0.1, 100.0);
  }

  public double price2() {
    final double basePrice = quantity * itemPrice;
    final double quantityDiscount = Math.max(0, quantity - 500) * itemPrice * 0.05;
    final double shipping = Math.min(basePrice * 0.1, 100.0);
    return basePrice - quantityDiscount + shipping;
  }
}

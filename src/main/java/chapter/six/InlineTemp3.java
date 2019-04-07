package chapter.six;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class InlineTemp3 {

  class Order {
    public double basePrice() {
      return 0;
    }
  }

  public boolean hasDiscount1(Order order) {
    double basePrice = order.basePrice();
    return basePrice > 1000;
  }

  public boolean hasDiscount2(Order order) {
    return order.basePrice() > 1000;
  }
}

package chapter.eleven.extract_subclass6.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public abstract class JobItem {
  private int quantity;

  protected JobItem(int quantity) {
    this.quantity = quantity;
  }

  public int getTotalPrice() {
    return quantity * getUnitPrice();
  }

  public int getQuantity() {
    return quantity;
  }

  public abstract int getUnitPrice();
}

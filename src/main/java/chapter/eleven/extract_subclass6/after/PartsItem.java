package chapter.eleven.extract_subclass6.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class PartsItem extends JobItem {
  private int unitPrice;

  public PartsItem(int quantity, int unitPrice) {
    super(quantity);
    this.unitPrice = unitPrice;
  }
  @Override public int getUnitPrice() {
    return unitPrice;
  }
}

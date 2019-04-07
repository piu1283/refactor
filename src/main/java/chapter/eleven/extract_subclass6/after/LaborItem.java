package chapter.eleven.extract_subclass6.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class LaborItem extends JobItem {
  private Employee employee;

  public LaborItem(int quantity, Employee employee) {
    super(quantity);
    this.employee = employee;
  }
  public Employee getEmployee() {
    return employee;
  }
  @Override public int getUnitPrice() {
    return employee.getRate();
  }
}

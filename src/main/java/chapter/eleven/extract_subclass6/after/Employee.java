package chapter.eleven.extract_subclass6.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class Employee {
  private int rate;

  public Employee(int rate) {
    this.rate = rate;
  }

  public int getRate() {
    return rate;
  }

  public static void main(String[] args) {
    Employee kent = new Employee(50);
    JobItem j1 = new LaborItem(5, kent);
    JobItem j2 = new PartsItem(15, 10);
    int total = j1.getTotalPrice() + j2.getTotalPrice();
  }
}

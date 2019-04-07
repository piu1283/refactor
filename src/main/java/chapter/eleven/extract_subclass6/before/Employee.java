package chapter.eleven.extract_subclass6.before;

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
    JobItem j1 = new JobItem(5, 0, true, kent);
    JobItem j2 = new JobItem(15, 10, false, null);
    int total = j1.getTotalPrice() + j2.getTotalPrice();
  }
}

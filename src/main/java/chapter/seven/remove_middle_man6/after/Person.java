package chapter.seven.remove_middle_man6.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Person {
  private Department department;

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department arg) {
    department = arg;
  }

  public static void main(String[] args) {
    Person john = new Person();
    Person manager = john.getDepartment().getManager();
  }
}

package chapter.seven.remove_middle_man6.before;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Person {
  private Department department;

  public void setDepartment(Department arg) {
    department = arg;
  }

  public Person getManager() {
    return department.getManager();
  }

  public static void main(String[] args) {
    Person john = new Person();
    Person manager = john.getManager();
  }

}

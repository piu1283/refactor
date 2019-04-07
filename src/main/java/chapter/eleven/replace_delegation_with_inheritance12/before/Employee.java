package chapter.eleven.replace_delegation_with_inheritance12.before;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class Employee {
  protected Person person;

  public Employee() {
    this.person = new Person();
  }

  public String getName() {
    return person.getName();
  }

  public void setName(String name) {
    person.setName(name);
  }

  @Override
  public String toString() {
    return "Emp: " + person.getLastName();
  }
}

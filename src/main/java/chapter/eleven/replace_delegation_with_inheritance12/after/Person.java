package chapter.eleven.replace_delegation_with_inheritance12.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class Person {
  private String name;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getLastName() {
    return name.substring(name.lastIndexOf(' ') + 1);
  }
}

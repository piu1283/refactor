package chapter.eight.replace_type_code_with_class13.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Person {
  private BloodGroup bloodGroup;

  public Person(BloodGroup bloodGroup) {
    bloodGroup = bloodGroup;
  }

  public void setBloodGroup(BloodGroup bloodGroup) {
    bloodGroup = bloodGroup;
  }

  public BloodGroup getBloodGroup() {
    return bloodGroup;
  }

  public static void main(String[] args) {
    // Somewhere in client code.
    Person parent = new Person(BloodGroup.O);
    if (parent.getBloodGroup() == BloodGroup.AB) {
      // ...
    }
  }
}

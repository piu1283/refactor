package chapter.eight.replace_type_code_with_class13.before;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Person {
  public static final int O = 0;
  public static final int A = 1;
  public static final int B = 2;
  public static final int AB = 3;

  private int bloodGroup;

  public Person(int code) {
    bloodGroup = code;
  }
  public void setBloodGroup(int code) {
    bloodGroup = code;
  }
  public int getBloodGroup() {
    return bloodGroup;
  }

  public static void main(String[] args) {
    // Somewhere in client code.
    Person parent = new Person(Person.O);
    if (parent.getBloodGroup() == Person.AB) {
      // ...
    }
  }
}

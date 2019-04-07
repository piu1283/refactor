package chapter.eight.replace_subclass_with_fields16.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Person {
  private final boolean isMale;
  private final char code;

  protected Person(boolean isMale, char code) {
    this.isMale = isMale;
    this.code = code;
  }

  static Person createMale() {
    return new Person(true, 'M');
  }

  static Person createFemale() {
    return new Person(false, 'F');
  }

  boolean isMale() {
    return isMale;
  }

  char getCode() {
    return code;
  }
}

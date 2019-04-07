package chapter.seven.inline_class4.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Person {
  private String name;
  private String number;
  private String areaCode;

  public String getName() {
    return name;
  }

  public String getTelephoneNumber() {
    return ("(" + areaCode + ") " + number);
  }

  public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String arg) {
    areaCode = arg;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String arg) {
    number = arg;
  }
}

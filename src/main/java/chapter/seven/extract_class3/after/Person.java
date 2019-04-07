package chapter.seven.extract_class3.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Person {
  private String name;
  private TelephoneNumber officeTelephone = new TelephoneNumber();

  public String getName() {
    return name;
  }

  public TelephoneNumber getOfficeTelephone() {
    return officeTelephone;
  }

  public String getTelephoneNumber() {
    return officeTelephone.getTelephoneNumber();
  }
}

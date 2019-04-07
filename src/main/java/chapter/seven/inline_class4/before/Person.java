package chapter.seven.inline_class4.before;

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
  public String getTelephoneNumber() {
    return officeTelephone.getTelephoneNumber();
  }
  public TelephoneNumber getOfficeTelephone() {
    return officeTelephone;
  }
}

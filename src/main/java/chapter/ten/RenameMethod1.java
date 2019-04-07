package chapter.ten;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class RenameMethod1 {
  private String officeAreaCode;
  private String officeNumber;

  public String getTelephoneNumber() {
    return ("(" + officeAreaCode + ") " + officeNumber);
  }

  public String getOfficeTelephoneNumber() {
    return ("(" + officeAreaCode + ") " + officeNumber);
  }
}

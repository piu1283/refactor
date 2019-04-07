package chapter.ten;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class SeparateQueryFromModifier4 {
  public void checkSecurity(String[] people) {
    String found = findCriminalAndAlert(people);
  }

  public String findCriminalAndAlert(String[] people) {
    for (int i = 0; i < people.length; i++) {
      if (people[i].equals("Don")) {
        sendAlert();
        return "Don";
      }
      if (people[i].equals("John")) {
        sendAlert();
        return "John";
      }
    }
    return "";
  }

  private void sendAlert() {
  }


  public void checkSecurity2(String[] people) {
    doSendAlert(people);
    String found = findCriminal(people);
  }

  public void doSendAlert(String[] people) {
    if (findCriminal(people) != "") {
      sendAlert();
    }
  }

  public String findCriminal(String[] people) {
    for (int i = 0; i < people.length; i++) {
      if (people[i].equals("Don")) {
        return "Don";
      }
      if (people[i].equals("John")) {
        return "John";
      }
    }
    return "";
  }

}

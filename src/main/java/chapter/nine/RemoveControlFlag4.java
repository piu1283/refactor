package chapter.nine;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class RemoveControlFlag4 {

  public void checkSecurity(String[] people) {
    boolean found = false;
    for (int i = 0; i < people.length; i++) {
      if (!found) {
        if (people[i].equals("Don")) {
          sendAlert();
          found = true;
        }
        if (people[i].equals("John")) {
          sendAlert();
          found = true;
        }
      }
    }
  }

  private void sendAlert() {
  }

  public void checkSecurity2(String[] people) {
    for (int i = 0; i < people.length; i++) {
      if (people[i].equals("Don")) {
        sendAlert();
        break;
      }
      if (people[i].equals("John")) {
        sendAlert();
        break;
      }
    }
  }
}

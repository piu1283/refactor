package chapter.six;

import java.util.Arrays;
import java.util.List;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class SubstituteAlgorithm9 {

  public String foundPerson1(String[] people) {
    for (int i = 0; i < people.length; i++) {
      if (people[i].equals("Don")) {
        return "Don";
      }
      if (people[i].equals("John")) {
        return "John";
      }
      if (people[i].equals("Kent")) {
        return "Kent";
      }
    }
    return "";
  }

  public String foundPerson2(String[] people) {
    List candidates = Arrays.asList(new String[] {"Don", "John", "Kent"});
    for (int i = 0; i < people.length; i++)
      if (candidates.contains(people[i]))
        return people[i];
    return "";
  }
}

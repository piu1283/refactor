package chapter.eight.encapsulate_collection11.before;



import org.junit.Assert;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Person {
  private Set courses;

  public Set getCourses() {
    return courses;
  }

  public void setCourses(Set arg) {
    courses = arg;
  }


  public static void main(String[] args) {
    // Client code
    Person kent = new Person();
    Set s = new HashSet();
    s.add(new Course("Smalltalk Programming", false));
    s.add(new Course("Appreciating Single Malts", true));
    kent.setCourses(s);
    Assert.assertEquals(2, kent.getCourses().size());

    Course refact = new Course("Refactoring", true);
    kent.getCourses().add(refact);
    kent.getCourses().add(new Course("Brutal Sarcasm", false));
    Assert.assertEquals(4, kent.getCourses().size());
    kent.getCourses().remove(refact);
    Assert.assertEquals(3, kent.getCourses().size());

    Iterator iter = kent.getCourses().iterator();
    int count = 0;
    while (iter.hasNext()) {
      Course each = (Course) iter.next();
      if (each.isAdvanced()) {
        count++;
      }
    }
    System.out.print("Advanced courses: " + count);
  }
}

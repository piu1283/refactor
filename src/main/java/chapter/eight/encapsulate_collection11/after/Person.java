package chapter.eight.encapsulate_collection11.after;


import org.junit.Assert;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Person {
  private Set courses = new HashSet();

  public Set getCourses() {
    return Collections.unmodifiableSet(courses);
  }

  public void initializeCourses(Set arg) {
    Assert.assertTrue(courses.isEmpty());
    courses.addAll(arg);
  }

  public void addCourse(Course arg) {
    courses.add(arg);
  }

  public void removeCourse(Course arg) {
    courses.remove(arg);
  }

  public int numberOfAdvancedCourses() {
    Iterator iter = getCourses().iterator();
    int count = 0;
    while (iter.hasNext()) {
      Course each = (Course) iter.next();
      if (each.isAdvanced()) {
        count++;
      }
    }
    return count;
  }

  public int numberOfCourses() {
    return courses.size();
  }

  public static void main(String[] args) {
    Person kent = new Person();
    kent.addCourse(new Course("Smalltalk Programming", false));
    kent.addCourse(new Course("Appreciating Single Malts", true));
    Assert.assertEquals(2, kent.numberOfCourses());
    Course refact = new Course("Refactoring", true);
    kent.addCourse(refact);
    kent.addCourse(new Course("Brutal Sarcasm", false));
    Assert.assertEquals(4, kent.numberOfCourses());
    kent.removeCourse(refact);
    Assert.assertEquals(3, kent.numberOfCourses());

    System.out.print("Advanced courses: " + kent.numberOfAdvancedCourses());
  }
}

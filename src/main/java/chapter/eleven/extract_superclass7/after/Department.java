package chapter.eleven.extract_superclass7.after;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class Department extends Party {
  private Vector items = new Vector();

  public Department(String name) {
    super(name);
  }

  @Override
  public int getAnnualCost() {
    int result = 0;
    Iterator i = items.iterator();
    while (i.hasNext()) {
      Party each = (Party) i.next();
      result += each.getAnnualCost();
    }
    return result;
  }

  @Override
  public int getHeadCount() {
    int headCount = 0;
    Iterator i = items.iterator();
    while (i.hasNext()) {
      Party each = (Party) i.next();
      headCount += each.getHeadCount();
    }
    return headCount;
  }

  public Enumeration getItems() {
    return items.elements();
  }

  public void addItem(Party arg) {
    items.addElement(arg);
  }
}

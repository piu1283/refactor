package chapter.eleven.replace_inheritance_with_delegation11.after;

import java.util.Vector;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class MyStack {
  private Vector vector = new Vector();

  public void push(Object element) {
    vector.insertElementAt(element, 0);
  }

  public Object pop() {
    Object result = vector.firstElement();
    vector.removeElementAt(0);
    return result;
  }

  public int size() {
    return vector.size();
  }

  public boolean isEmpty() {
    return vector.isEmpty();
  }

}

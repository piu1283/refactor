package chapter.eleven.replace_inheritance_with_delegation11.before;

import java.util.Vector;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class MyStack extends Vector {
  public void push(Object element) {
    insertElementAt(element, 0);
  }

  public Object pop() {
    Object result = firstElement();
    removeElementAt(0);
    return result;
  }
}

package chapter.ten;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class ReplaceExceptionWithTest15 {
  private Stack available;
  private Stack allocated;

  public Resource getResource() {
    Resource result;
    try {
      result = (Resource) available.pop();
      allocated.push(result);
      return result;
    } catch (EmptyStackException e) {
      result = new Resource();
      allocated.push(result);
      return result;
    }
  }

  public Resource getResource1() {
    Resource result;
    if (available.empty()) {
      result = new Resource();
    } else {
      result = (Resource) available.pop();
    }
    allocated.push(result);
    return result;
  }

  class Resource {

  }
}

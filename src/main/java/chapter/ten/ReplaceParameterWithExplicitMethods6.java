package chapter.ten;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class ReplaceParameterWithExplicitMethods6 {
  private int height;
  private int width;

  void setValue(String name, int value) {
    if (name.equals("height")) {
      height = value;
      return;
    }
    if (name.equals("width")) {
      width = value;
      return;
    }
  }

  void setHeight(int arg) {
    height = arg;
  }

  void setWidth(int arg) {
    width = arg;
  }
}

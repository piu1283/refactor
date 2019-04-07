package chapter.eight;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class EncapsulateField10 {
  class Student1 {
    public String name;
  }


  class Student2 {
    private String name;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }
}

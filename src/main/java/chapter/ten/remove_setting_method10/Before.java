package chapter.ten.remove_setting_method10;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class Before {
  class Account {

    private String id;

    public Account(String id) {
      setId(id);
    }

    public void setId(String id) {
      this.id = id;
    }
  }
}

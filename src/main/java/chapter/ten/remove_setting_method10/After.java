package chapter.ten.remove_setting_method10;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class After {
  class Account {
    private String id;

    public Account() {
    }

    public Account(String id) {
      initializeId(id);
    }

    protected void initializeId(String id) {
      this.id = "ID" + id;
    }
  }


  class InterestAccount extends Account {
    private double interestRate;

    public InterestAccount(String id, double interestRate) {
      initializeId(id);
      this.interestRate = interestRate;
    }
  }
}

package chapter.nine.introduce_null_object7.before;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class Site {

  private Customer customer;

  public Customer getCustomer() {
    return customer;
  }

  public static void main(String[] args) {
    // Somewhere in client code
    Site site = new Site();
    Customer customer = site.getCustomer();
    String customerName;
    if (customer == null) {
      customerName = "N/A";
    } else {
      customerName = customer.getName();
    }
    System.out.println(customerName);

    BillingPlan plan;
    if (customer == null) {
      plan = BillingPlan.basic();
    } else {
      plan = customer.getPlan();
    }

    int weeksDelinquent;
    if (customer == null) {
      weeksDelinquent = 0;
    } else {
      weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
    }
  }
}

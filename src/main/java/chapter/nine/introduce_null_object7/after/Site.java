package chapter.nine.introduce_null_object7.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class Site {

  private Customer customer;

  public Customer getCustomer() {
    return (customer == null) ? Customer.newNull() : customer;
  }

  public static void main(String[] args) {
    // Somewhere in client code
    Site site = new Site();
    Customer customer = site.getCustomer();
    String customerName = customer.getName();
    System.out.println(customerName);
    BillingPlan plan = customer.getPlan();

    int weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
  }
}

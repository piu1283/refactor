package chapter.eleven.form_template_method10.after;

import java.util.Vector;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class Customer {
  private Vector rentals = new Vector();
  private String name;

  public String statement() {
    return new TextStatement().value(this);
  }

  public String htmlStatement() {
    return new HtmlStatement().value(this);
  }

  public double getTotalFrequentRenterPoints() {
    return 0;
  }

  public int getTotalCharge() {
    return 0;
  }

  public Vector getRentals() {
    return rentals;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

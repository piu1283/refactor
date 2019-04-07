package chapter.eleven.form_template_method10.before;

import chapter.eleven.form_template_method10.Rental;

import java.util.Iterator;
import java.util.Vector;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class Customer {
  private Vector rentals = new Vector();

  public String statement() {
    Iterator iterator = rentals.iterator();
    String result = "Rental Record for " + getName() + "\n";
    while (iterator.hasNext()) {
      Rental each = (Rental) iterator.next();
      //show figures for this rental
      result += "\t" + each.getMovie().getTitle() + "\t" +
          String.valueOf(each.getCharge()) + "\n";
    }
    //add footer lines
    result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
    result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) +
        " frequent renter points";
    return result;
  }

  public String htmlStatement() {
    Iterator iterator = rentals.iterator();
    String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n";
    while (iterator.hasNext()) {
      Rental each = (Rental) iterator.next();
      //show figures for each rental
      result += each.getMovie().getTitle() + ": " +
          String.valueOf(each.getCharge()) + "<BR>\n";
    }
    //add footer lines
    result += "<P>You owe <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
    result += "On this rental you earned <EM>" +
        String.valueOf(getTotalFrequentRenterPoints()) +
        "</EM> frequent renter points<P>";
    return result;
  }

  private String getName() {
    return null;
  }

  private double getTotalFrequentRenterPoints() {
    return 0;
  }

  private int getTotalCharge() {
    return 0;
  }
}

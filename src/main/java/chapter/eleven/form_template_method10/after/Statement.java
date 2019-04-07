package chapter.eleven.form_template_method10.after;

import chapter.eleven.form_template_method10.Rental;

import java.util.Iterator;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public abstract class Statement {

  public String value(Customer aCustomer) {
    Iterator rentals = aCustomer.getRentals().iterator();
    String result = headerString(aCustomer);
    while (rentals.hasNext()) {
      Rental each = (Rental) rentals.next();
      result += eachRentalString(each);
    }
    result += footerString(aCustomer);
    return result;
  }

  abstract String headerString(Customer aCustomer);

  abstract String eachRentalString(Rental aRental);

  abstract String footerString(Customer aCustomer);
}

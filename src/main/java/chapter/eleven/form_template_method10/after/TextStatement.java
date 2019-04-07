package chapter.eleven.form_template_method10.after;

import chapter.eleven.form_template_method10.Rental;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class TextStatement extends Statement {

  String headerString(Customer aCustomer) {
    return "Rental Record for " + aCustomer.getName() + "\n";
  }

  String eachRentalString(Rental aRental) {
    return "\t" + aRental.getMovie().getTitle() + "\t" +
        String.valueOf(aRental.getCharge()) + "\n";
  }

  String footerString(Customer aCustomer) {
    return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n" +
        "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";
  }
}

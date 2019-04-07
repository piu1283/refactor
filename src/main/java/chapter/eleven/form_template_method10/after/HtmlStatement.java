package chapter.eleven.form_template_method10.after;

import chapter.eleven.form_template_method10.Rental;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class HtmlStatement extends Statement {

  String headerString(Customer aCustomer) {
    return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
  }

  String eachRentalString(Rental aRental) {
    return aRental.getMovie().getTitle() + ": " +
        String.valueOf(aRental.getCharge()) + "<BR>\n";
  }

  String footerString(Customer aCustomer) {
    return "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) +
        "</EM><P>" + "On this rental you earned <EM>" +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        "</EM> frequent renter points<P>";
  }
}

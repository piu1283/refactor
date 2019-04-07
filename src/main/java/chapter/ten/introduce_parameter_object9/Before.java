package chapter.ten.introduce_parameter_object9;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class Before {
  class Account {
    // ...
    private Vector transactions = new Vector();

    public double getFlowBetween(Date start, Date end) {
      double result = 0;
      Enumeration e = transactions.elements();
      while (e.hasMoreElements()) {
        Transaction each = (Transaction) e.nextElement();
        if (each.getDate().compareTo(start) >= 0 && each.getDate().compareTo(end) <= 0) {
          result += each.getValue();
        }
      }
      return result;
    }
  }

  class Transaction {
    private Date chargeDate;
    private double value;

    public Transaction(double value, Date chargeDate) {
      this.value = value;
      this.chargeDate = chargeDate;
    }
    public Date getDate() {
      return chargeDate;
    }
    public double getValue() {
      return value;
    }
  }


}

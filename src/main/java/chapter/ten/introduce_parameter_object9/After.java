package chapter.ten.introduce_parameter_object9;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class After {
  class Account {
    // ...
    private Vector transactions = new Vector();

    public double getFlowBetween(DateRange range) {
      double result = 0;
      Enumeration e = transactions.elements();
      while (e.hasMoreElements()) {
        Transaction each = (Transaction) e.nextElement();
        if (range.includes(each.getDate())) {
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

  class DateRange {
    private final Date start;
    private final Date end;

    public DateRange(Date start, Date end) {
      this.start = start;
      this.end = end;
    }
    public Date getStart() {
      return start;
    }
    public Date getEnd() {
      return end;
    }
    public boolean includes(Date arg) {
      return arg.compareTo(start) >= 0 && arg.compareTo(end) <= 0;
    }
  }

}

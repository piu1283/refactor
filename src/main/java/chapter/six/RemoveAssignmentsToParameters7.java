package chapter.six;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class RemoveAssignmentsToParameters7 {
  int discount1(int inputVal, int quantity, int yearToDate) {
    if (inputVal > 50) {
      inputVal -= 2;
    }
    if (quantity > 100) {
      inputVal -= 1;
    }
    if (yearToDate > 10000) {
      inputVal -= 4;
    }
    return inputVal;
  }

  int discount2(final int inputVal, final int quantity, final int yearToDate) {
    int result = inputVal;
    if (inputVal > 50) {
      result -= 2;
    }
    if (quantity > 100) {
      result -= 1;
    }
    if (yearToDate > 10000) {
      result -= 4;
    }
    return result;
  }
}

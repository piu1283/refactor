package chapter.one.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public abstract class Price {
  abstract int getPriceCode();        //取得价格代号

  abstract double getCharge(int daysRented);

  int getFrequentRenterPoints(int daysRented){
    return 1;
  }
}

package chapter.one.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public class NewReleasePrice extends Price {
  int getPriceCode() {
    return Movie.NEW_RELEASE;
  }

  double getCharge(int daysRented){
    return daysRented * 3;
  }

  int getFrequentRenterPoints(int daysRented) {
    return (daysRented > 1) ? 2: 1;
  }
}

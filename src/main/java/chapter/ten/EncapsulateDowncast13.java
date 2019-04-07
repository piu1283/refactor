package chapter.ten;

import java.util.Vector;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class EncapsulateDowncast13 {

  class Reading {
    private Vector readings;

    Object lastReading() {
      return readings.lastElement();
    }

    Reading lastReading1() {
      return (Reading) readings.lastElement();
    }
  }
}

package chapter.eight.change_reference_to_value4.before;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Currency {
  private String code;

  private Currency(String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }

}

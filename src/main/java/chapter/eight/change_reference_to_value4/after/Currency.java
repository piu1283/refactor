package chapter.eight.change_reference_to_value4.after;

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

  @Override
  public boolean equals(Object arg) {
    if (!(arg instanceof Currency)) return false;
    Currency other = (Currency) arg;
    return code.equals(other.getCode());
  }

  @Override
  public int hashCode() {
    return code.hashCode();
  }
}

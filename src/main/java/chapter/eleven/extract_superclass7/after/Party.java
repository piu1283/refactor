package chapter.eleven.extract_superclass7.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/7.
 */
public abstract class Party {
  protected String name;

  protected Party(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public abstract int getAnnualCost();

  public abstract int getHeadCount();
}

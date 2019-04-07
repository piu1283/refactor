package chapter.eight.replace_type_code_with_class13.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class BloodGroup {
  public static final BloodGroup O = new BloodGroup(0);
  public static final BloodGroup A = new BloodGroup(1);
  public static final BloodGroup B = new BloodGroup(2);
  public static final BloodGroup AB = new BloodGroup(3);
  private final int code;

  private BloodGroup(int code) {
    this.code = code;
  }

  public int getCode() {
    return this.code;
  }
}

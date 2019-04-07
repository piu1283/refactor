package chapter.eight.replace_subclass_with_fields16.before;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Female extends Person {
  @Override boolean isMale() {
    return false;
  }
  @Override char getCode() {
    return 'F';
  }
}

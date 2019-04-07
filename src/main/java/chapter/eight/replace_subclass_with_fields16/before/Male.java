package chapter.eight.replace_subclass_with_fields16.before;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Male extends Person {
  @Override boolean isMale() {
    return true;
  }
  @Override char getCode() {
    return 'M';
  }
}

package chapter.nine.replace_conditional_with_polymorphism6.before;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
class Manager extends EmployeeType {
  @Override public int getTypeCode() {
    return MANAGER;
  }
}

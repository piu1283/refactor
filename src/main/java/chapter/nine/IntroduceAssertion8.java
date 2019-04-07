package chapter.nine;


import org.springframework.util.Assert;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/5.
 */
public class IntroduceAssertion8 {
  private static final int NULL_EXPENSE = 0;

  public double getExpenseLimit(int expenseLimit, PrimaryProject primaryProject) {
    // Should have either expense limit or
    // a primary project.
    return (expenseLimit != NULL_EXPENSE) ?
        expenseLimit :
        primaryProject.getMemberExpenseLimit();
  }

  public double getExpenseLimit1(int expenseLimit, PrimaryProject primaryProject) {
    Assert.isTrue(expenseLimit != NULL_EXPENSE || primaryProject != null);

    return (expenseLimit != NULL_EXPENSE) ?
        expenseLimit :
        primaryProject.getMemberExpenseLimit();
  }

  class PrimaryProject {
    int getMemberExpenseLimit() {
      return 0;
    }
  }
}

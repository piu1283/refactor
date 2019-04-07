package chapter.eight.replace_array_with_object5.after;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Tournament {
  Performance row = new Performance();

  public Tournament() {
    row.setName("Liverpool");
    row.setScore("15");
  }

  public void displayScore() {
    String name = row.getName();
    int score = row.getScore();
  }
}

package chapter.eight.replace_array_with_object5.before;

/**
 * @author gaoxiaoqing@sensorsdata.cn
 * @since 2019/4/6.
 */
public class Tournament {
  String[] row = new String[2];

  public Tournament() {
    row[0] = "Liverpool";
    row[1] = "15";
  }
  public void displayScore() {
    String name = row[0];
    int score = Integer.parseInt(row[1]);
  }
}

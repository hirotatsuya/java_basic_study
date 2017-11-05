// Created by hirotatsu on 2017/11/02.
class Array4 {
  public static void main(String[] args) {
    int[] points = {64, 76, 58, 72, 48};
    int mini = 0;
    boolean flag = true;
    for (int i = 0; i < points.length; i++) {
      if (flag) {
        mini = points[i];
        flag = !flag;
      } else if (mini > points[i]) {
        mini = points[i];
      }
    }
    System.out.println(mini);
  }
}
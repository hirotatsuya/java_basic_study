// Created by hirotatsu on 2017/11/05.
class Array6 {
  public static void main(String[] args) {
    int[][] points = {{10, 20}, {30, 40, 50, 60}, {70, 80, 90}};
    for (int i = 0; i < points.length; i++) {
      for (int j = 0; j < points[i].length; j++) {
        System.out.println(points[i][j]);
      }
    }
  }
}

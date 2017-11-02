// Created by hirotatsu on 2017/11/02.
class Array3 {
  public static void main(String[] args) {
    int[] points = {64, 76, 58, 72, 48};
    int max = 0;
    for (int i = 0; i < points.length; i++) {
      if (max < points[i]) {
        max = points[i];
      }
    }
    System.out.println(max);
  }
}
// Created by hirotatsu on 2017/11/02.
class Array5 {
  public static void main(String[] args) {
    int[] points = {23, 44, 32, 57, 31};
    for (int i = 0; i < points.length; i++) {
      if (points[i] % 2 == 0) {
        System.out.println(points[i]);
      }
    }
  }
}
// Created by hirotatsu on 2017/11/02.
class Array2 {
  public static void main(String[] args) {
    int[] points = {64, 76, 58, 72, 48};
    int total = 0;
    for (int i = 0; i < points.length; i++) {
      total = total + points[i];
    }
    System.out.println(total);
  }
}
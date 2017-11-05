// Created by hirotatsu on 2017/11/05.
class Method5 {
  static int maxValue(int[] array) {
    int max = 0;
    for (int i = 0; i < array.length; i++) {
      if (max < array[i]) {
        max = array[i];
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int[] points = {20, 42, 15};
    System.out.println(maxValue(points));
  }
}

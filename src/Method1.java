// Created by hirotatsu on 2017/11/05.
class Method1 {
  static int sum(int a, int b, int c) {
    int x = a + b + c;
    return x;
  }

  public static void main(String[] args) {
    int result = sum(2, 4, 6);
    System.out.println(result);
  }
}

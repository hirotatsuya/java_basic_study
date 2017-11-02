// Created by hirotatsu on 2017/11/02.
class ForSample6 {
  public static void main(String[] args) {
    int total = 0;
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        total = total + i;
      }
    }
    System.out.println(total);
  }
}


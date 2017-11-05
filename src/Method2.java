// Created by hirotatsu on 2017/11/05.
class Method2 {
  static String checkAge(int age) {
    if (age >= 20) {
      return "OK";
    } else {
      return "NG";
    }
  }

  public static void main(String[] args) {
    String result = checkAge(19);
    System.out.println(result);
  }
}

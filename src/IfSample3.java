// Created by hirotatsu on 2017/11/02.
class IfSample3 {
  public static void main(String[] args) {
    int age;
    age = 20;
    boolean student = true;
    if (age < 20 && !student) {
      System.out.println("NG");
    } else {
      System.out.println("OK");
    }
  }
}


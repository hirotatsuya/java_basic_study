import java.io.*;

// Created by hirotatsu on 2017/11/06.
class SwitchSample {
  public static void main(String[] args) {
    String str = "a";
    switch (str) {
      case "a":
        System.out.println("当たり");
        break;
      case "b":
        System.out.println("まあまあまあ");
        break;
      case "c":
        System.out.println("はずれ");
        break;
      default:
        System.out.println("a,b,cのいずれかを入力してください");
        break;
    }
  }
}


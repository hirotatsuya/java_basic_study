// Created by hirotatsu on 2017/11/02.
class Temp {
  public static void main(String[] args) {
    // 日本語の場合はエラーの可能性がある
    // ファイルの保存時のエンコーディング形式がUTF-8であったりするとエラーになる
    // その時は保存時の形式をMS932かShift_JISにするとエラーがなくなる
    // または、コンパイル時にjavac -encoding utf-8 Temp.javaのようにエンコーディングを指定する
    System.out.println("こんにちは");
    System.out.println(System.getProperty("file.encoding"));
  }
}


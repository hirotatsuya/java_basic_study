// Created by hirotatsu on 2017/11/02.
class Temp {
  public static void main(String[] args) {
    /*
    - 日本語の場合はエラーの可能性がある
      - ファイルの保存時のエンコーディング形式が実行時のエンコードと異なる場合に起こる
        - 保存時がUTF-8であるのに、実行時(コマンドプロンプト等)はMS932やShift_JISの時
    - 対応
      - 保存時の形式をMS932かShift_JISにする
      - コンパイル時にjavac -encoding utf-8 Temp.javaのようにエンコーディングを指定する
    */
    System.out.println("こんにちは");
    System.out.println(System.getProperty("file.encoding"));

    // 参照型の比較
    String a = "りんご";
    String b = new String("りんご");
    String c = "りんご";
    System.out.println(a.hashCode());
    System.out.println(b.hashCode());
    System.out.println(c.hashCode());
    System.out.println(a == c); // true
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(a == b); // 参照している場所が異なる // false
    System.out.println(a.equals(b)); // 中身のデータは同じ // true

    // 三項演算子
    int value = 9;
    System.out.println(value == 10 ? "10だよ" : "10じゃない");
  }
}


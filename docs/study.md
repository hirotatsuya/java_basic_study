# Java Basic

### もくじ
- [はじめに](#はじめに)
- [JDKのインストール](#jdkのインストール)
- [HelloWorld!](#helloworld)
- [HelloWorldの考察](#helloworldの考察)
- [変数](#変数)
- [分岐構造](#分岐構造)
- [反復構造](#反復構造)
- [配列](#配列)
- [メソッド](#メソッド)
- [おわりに](#おわりに)


## はじめに
- アイスブレイク
  - 「最近寒いね～～」
  - 「でも今回の研修は、、熱くいこう！！」
    → ***アイスブレイク***
- 本日のスケジュールをざっと説明
  - どういう流れで進めていくのか
  - 目標: 一人で「Javaの環境設定をする、コードを書く、実行する」ができるようになる
- 経費精算シートの記入
  - 今まで忘れてたやつを記入
- タイピング
  - [`https://www.e-typing.ne.jp/`](https://www.e-typing.ne.jp/)
  - 目標は、前回プラス20点
  - タイピングの大切さを熱弁
    - プログラムを書くにあたり、頭でわかっていても、コードに落とし込むのは結局自分の手である
    - タイピングの速さにより作業効率が大幅に変わる→タイピングはPC作業の土台であるため
    - タイピングはやればやるだけ伸びる→基本に忠実なら
  - ~~僕もやるｗ~~ 
- 前回の内容の不明点確認
  - HTML,CSS,JavaScriptの講義の不明点や気になる点はないかどうか
    - 簡単な演習
      - `fukusyu.html`参照
- 今日の講義の進め方
  - 座学 → エクササイズの流れで進む
  - いつでもどのタイミングでも疑問に思ったら質問してほしい
    - これはみんな同じことを言うと思う
  - 講義後も必要があれば残って学習していいよ！
  - ただ、僕もわからないことがあると思うので、その時は一緒に考えたりみんながエクササイズ中に調べるので、その辺は、、よろしくお願いします(._.)
- 確認テスト
  - HTML,CSS,JavaScriptの理解度テストの実施
    - とりあえず15分でやる
    - 足りなかったらプラス5分
  - 全員終わったらみんなで答え合わせ
  - ~~間違えたら居残り~~  みんなで復習


## JDKのインストール
- JDKのインストール
  - Oracleの公式サイトよりJDKのダウンロードページに遷移する
    - [`http://www.oracle.com/technetwork/java/javase/downloads/index.html`](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
  - 自分のPCのOSの確認
    - `設定/システム/バージョン情報/システムの種類`から何bit版か見る
    - 恐らく64bit版WindowsOS
      - `×86`は32bit版WindowsOS
  - `Java SE Development Kit 9.0.1`をダウンロードする
    - 10分くらい
    - 同意してから
  - ダウンロードした`.exe`ファイルを実行し、インストールを進める

    ![image](https://github.com/hirotatsuya/java_basic_study/blob/images/jdk_install.png 'image')

    - JDKがどこにインストールされたのか覚えておく
    - `.exe`ファイルとは？拡張子とは?
      - `.exe`ファイルとは実行ファイルのこと
      - 拡張子とはファイルの種類を識別するためのもの
  - pathを設定する
    - `コントロールパネル/システムとセキュリティ/システム/システムの詳細設定/環境変数/`から環境変数を切る
    - `Path`の編集からJDKのpathを設定する
    - `JAVA_HOME`という変数名で環境変数を設定する
      - 理由: tomcatでjavaを用いるときにJAVA_HOMEを使っているため
      - 定数は大文字でスネークケースが多い
        - 命名規則
          - スネークケース: アンダーバーで分ける(ex: JAVA_HOME)(蛇みたいだから)
          - キャメルケース: 大文字小文字で分ける(ex: HelloWorld)(ラクダのこぶみたいだから)
    - 値はインストールしたJDKの場所を設定する
      - `C:\Program Files\Java\jdk1.8.0_131`にあると思う
    - 環境変数とは？
      - OSが提供するデータ共有システムのこと
      - 簡単に言うとコンピュータが持っているデータを格納する箱
      - コマンドプロンプトで`set`と入力すると環境変数の一覧がみられる
    - なぜ環境変数を設定するのか? → あとで復習する
      - 毎回`C:\Program Files\Java\jdk1.8.0_131\bin\javac.ext`見たいに書くのが面倒だから
      - 簡単なショートカットキーみたいなもの
  - コマンドプロンプトで`java -version`と入力する
    - コマンドプロンプトは`cortana`さんに`cmd`と入力すると表示される


### 休憩


## HelloWorld!
- `HelloWorld.java`ファイルを保存する場所はC直下に`sample`というディレクトリを作成してその中に保存する
- `javac HelloWorld.java`
  - 失敗するとエラーメッセージが表示される
  - 成功すると`.class`ファイルが生成される
- コマンドプロンプト
  - コマンドプロンプトで遊んでみよう
    - `dir`
      - 今いるディレクトリのファイルやディレクトリ一覧の表示
      - 多くは`ls`でいける。。。
        - シェルの違い
    - `cd`
      - `cd ..`で一つ上のディレクトリに移動
      - `cd (target)`で指定したディレクトリに移動
    - `pwd`
      - 自分が今いる場所を表示
    - `mkdir (directory_name)`
      - 新しいディレクトリを作成する
    - `exit`
      - cmdを抜ける
    - `java -version`
      - javaのバージョン確認
      - javaがインストールされていない場合やpathが通っていない場合はバージョンが表示されない
  - コマンドの種類
    - 内部コマンド
      - whereで調べたときに`与えられたパターンのファイルが見つかりませんでした`と出力される
      - コマンドプロンプトに最初から入っているプログラム
      - mkdir, cd, lsなど
    - 外部コマンド
      - 外部のプログラムによって使えるようになっているコマンド
      - `.exe`ファイルとしてPCに入っていて、そのファイルを実行することによりコマンドを使っている
      - where, helpなど
    - バッチファイル
      - java, javacコマンド
      - PC起動時に起動するプログラムでそのままPCが終了するまで使うことができる
    - 操作可能なプログラム
      - yes or noを聞いてくるやつ
- コンパイルとは?
  - プログラム(僕たちが書いたもの)をコンピュータが実行可能な形式に変換すること
  - 今回は`.java`ファイルを`.class`ファイルにしている
  - JVMの上で実行するには`.class`ファイルにコンパイルする必要がある
  - `javac (java file)`
    - javaファイルをコンパイルする
  - `java (class name)`
    - クラス名を指定してJVM上で実行する
  - `java -classpath (jar file) (class name)`
    - classpathを紐づける


## HelloWorldの考察
- mainメソッドの暗記

  ```HelloWorld.java
  class HelloWorld {
    public static void main(String[] args) {
      System.out.println("Hello World!");
    }
  }
  ```

  - HelloWorldクラスを定義している
    - ファイル名はクラス名と同様にするべき
  - `main`メソッドとは、javaのプログラムで一番最初に呼び出されるメソッドのこと
  - クラスに関しては、ただの設計図であって、実態ではないということだけ今は抑えておく
  - `System.out.println()`
    - System: クラス
    - out: フィールド
    - println: メソッド
- コメントアウトの方法
  - `//`は一行すべてコメントアウトする
  - `/*`と`*/`で囲まれた部分はすべてコメントアウトされる
- エクササイズ


## 変数
- データ型
  - 基本データ型(プリミティブ型)
    - boolean, byte, char, short, int, float, long, double
  - 参照型(その場所を示すコード)
    - String, 配列, オブジェクト
- 変数のイメージの可視化
  - 変数は箱のようなもの
  - 変数名は箱の名前
  - 変数の型はその箱に入れるものを決めるルール
  - 値はその箱の中身
- 算術演算子
  - `+ - * / % ++ --`
  - インクリメント演算子とデクリメント演算子
    - `++`,`--`
    - 前置と後置がある
      - `i++`と`++i`は異なる
      - インクリメントとするタイミングの違い
- 比較
  - 比較演算子 → `==`
  - `equals()`メソッド
- エクササイズ


### 休憩
- お昼ご飯
- 時間があったら、、、
- `jshell`について(簡単に)
  - インタプリンタの特性を生かしたREPL
  - ターミナルで`jshell`と入力する
  - 以下のコードを入力する

    ```java
    System.out.println("Hello jshell")
    ```

    - `Hello jshell`と出力される
    - `/exit`でjshellを抜ける
- シェルとは
  - ユーザからのコマンドを受け取りそのコマンドを実行するためのプログラムのこと
  - 中身
- ターミナル
  - 見た目や操作性を担当する端末エミュレータ
  - 外身


### おはなし会


### 復習
- 午前中の講義の質問
  - 環境変数を設定する理由は？
  - mainメソッドとは？
  - データ型を8つ言える？


## 分岐構造
- 構造の種類
  - 順次構造
    - 上から順番に処理を行っていく
  - 分岐構造
    - 条件により行う処理と行わない処理がある
  - 反復構造
    - 同じ処理を何度も行う
- 制御構文
  - 条件分岐構文
    - if, switch, 三項演算子
    - 「もし、こうだっら～～違ったら～～」
  - 繰り返し処理
    - for, while, do-while, 拡張for文
    - 「この条件に一致するまでループする～～」
- 分岐構造
  - `if`文
  - `else`文
  - `else if`文
  - ブロック内のコードが1文である場合は、`{}`を省略することも可能
    - ただ、可読性が落ちるため、`{}`を省略することはあまりしない
  - `switch`文
    - `SwitchSample.java`参照
- 関係演算子
  - `< > <= >= == !=`
- 論理演算子
  - `&& || !`
  - 関係演算子と論理演算子はセットで用いることが多い
- エクササイズ


## 反復構造
- for文の重要性
  - while文を使う機会はあまりない(使う人は使うらしい。。。)
    - Javaでは使う機会はある
      - DBアクセスの時とかはwhile文を用いる
  - ほとんどfor文で繰り返し文は記述する
    - 自分のプロジェクトではwhile文は一度も使わずすべてfor文であった
- 無限ループの例
  - `InfiniteSample.java`参照
  - もし実行したら、永遠と出力が続いてしまう
    - `ctrl  + c`で止める
- if文とfor文で世界は回っている
  - プログラムはif文とfor文の組み合わせでほとんどが成り立っている
  - 世界はプログラムで出来ている
    - [`https://ja.wikipedia.org/wiki/シミュレーション仮説`](https://ja.wikipedia.org/wiki/シミュレーション仮説)
  - つまり、世界はifとfor文で回っている
    - 正確には順次構造、分岐構造、反復構造で回っている
- エクササイズ


### 休憩


## 配列
- 配列のイメージの可視化
  - 配列はグループ化すること
  - 同じパターンで変数を定義するならまとめて定義しちゃったほうが簡単
    - 同じ型で同じ対象の変数を定義する場合
      - 仕事での実装例
        - 拠点が3種類ある会社さんのシステムでその3拠点をそれぞれ宣言するのは無駄
          - 配列でまとめて定義して用いる
- ~~固定長と可変長~~
  - ~~固定長~~
    - ~~長さが決まっている~~
    - ~~後から追加や削除ができない~~
  - ~~可変長~~
    - ~~長さが決まっていない~~
    - ~~自由に追加や削除ができる~~
- arrayとlist
  - arrayに似ているものとして、後にlistというものがでてくる
  - listは可変長であるため、使いやすいので実際は配列よりもlistを使うことが多い
  - 今回はarray(配列のみ)
    - 後のほうでlistの講義もあるからお楽しみに～
- 拡張for文
  - `ExtensionForSample.java`参照
  - 配列用のfor文みたいなやつ
    - わざわざ配列の長さを取得(`length`)しなくてもよい
  - 配列とfor文を用いるときは使用頻度高めになる
- エクササイズ


## メソッド
- メソッドの切り分けの必要性
  - 処理を細かく分けて、同じ処理を何度も記述するような無駄なことをしないようにするための仕組み
  - クラスの名前や変数の名前と同様にメソッドの名前も重要である
    - 定義したメソッドがどのような処理をするのかを一目でわかるようにするため
  - メソッドと同じ立ち位置で関数という言葉もあるが、Javaではメソッドと表現することが多い
- 自分の業務における経験談
  - 自分は、あまりメソッドに切り出さずにごりごりと書くことが多く、そのコードを先輩に見てもらうタイミングで、「見ずらい」と言われてしまった。
  - 機能追加や修正等の時に、メソッドに切り出していないと、どこにどのような処理を追加すればいいのかわかりにくい。
- 用語
  - 引数
    - メソッドの定義時に、メソッドが呼ばれるタイミングで渡したい値を引数として受け取る
  - 戻り値
    - メソッドの終了時に、メソッドの呼び出し元に返したい値を戻り値として返す
- エクササイズ


### 復習
- 午後の講義の質問
- 全体を通しての質問
- 次の回にどのようなことをやるのかのざっくりとした説明
  - Eclipseという統合開発環境をインストールする(エディタでもあり、実行もでき、デバッグもできる)
  - Javaのオブジェクト指向の話
  - 伝言: ITCARET読んどいてね～


## おわりに
- アンケート記入
- 交通費精算


#### [トップに戻る](#java-basic)
---
## 参考資料
- Javaコード入門
  - [`http://java-code.jp/`](http://java-code.jp/)
- ドットインストール
  - [`https://dotinstall.com/lessons/basic_java_v2`](https://dotinstall.com/lessons/basic_java_v2)
- Java8のAPIドキュメント
  - [`https://docs.oracle.com/javase/jp/8/docs/api/`](https://docs.oracle.com/javase/jp/8/docs/api/)
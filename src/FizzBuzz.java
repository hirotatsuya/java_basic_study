// Created by hirotatsu on 2017/11/06.
/**
 * javac FizzBuzz.java
 * java FizzBuzz (number)
 * ex) java FizzBuzz 30
 */
class FizzBuzz {
  public static void main(String[] args) {
      for (int i = 1; i <= Integer.parseInt(args[0]); i++) System.out.println((i % 15 == 0 ? "FizzBuzz" : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : i));
  }
}
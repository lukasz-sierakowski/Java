package tdd.fizzBuzzKata;

public class FizzBuzzKata9 {
  public static String getString(int number) {
    if(number %15== 0){
      return "FizzBuzz";
    }
    if(number %3== 0){
      return "Fizz";
    }
    if(number %5== 0){
      return "Buzz";
    }
    return Integer.valueOf(number).toString();
  }
}

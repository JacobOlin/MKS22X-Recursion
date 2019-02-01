public class recursion{

  public static void main(String[]args) {
    for (int i = 0;i < 10;i += 1) {
      System.out.println(i + ":  " + fib(i));
    }
  }

  public static double sqrt(double n) {
    return findSqrt(n,1);
  }

  private static double findSqrt(double n,double guess){
    if (n == 0) {
      return n;
    }
    if (Math.abs((guess * guess - n) / n) <= 0.000000001) {
      return guess;
    }
    return findSqrt(n,(n/guess + guess) / 2);
  }

  public static int fib(int n){
    return fib(n,1,0);
  }

  public static int fib(int n,int prev, int prev2) {
    if (n <= 1) {
      return prev + prev2;
    }
    return fib(n - 1,prev + prev2,prev);
  }
}

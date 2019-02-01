public class recursion{

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
}

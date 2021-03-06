import java.util.ArrayList;
public class recursion{

  public static void main(String[]args) {
    /*for (int i = 0;i < 10;i += 1) {
      System.out.println(i + ":  " + fib(i));
    }*/
    /*System.out.println(makeAllSums(0));
    System.out.println(makeAllSums(1));
    System.out.println(makeAllSums(2));
    System.out.println(makeAllSums(3));*/
  }

  public static double sqrt(double n,double error) {
    return findSqrt(n,1,error);
  }

  private static double findSqrt(double n,double guess,double error){
    if (n == 0) {
      return n;
    }
    if (Math.abs((guess * guess - n) / n) <= error) {
      return guess;
    }
    return findSqrt(n,(n/guess + guess) / 2,error);
  }

  public static int fib(int n){
    if (n == 0) {
      return 0;
    }
    return fib(n,1,0);
  }

  public static int fib(int n,int prev, int prev2) {
    if (n <= 2) {
      return prev + prev2;
    }
    return fib(n - 1,prev + prev2,prev);
  }

  public static ArrayList<Integer> makeAllSums(int n) {
    ArrayList<Integer> a = new ArrayList<Integer>();
    mAS(a,n,0);
    return a;
  }

  public static boolean mAS(ArrayList<Integer> a,int n, int target) {
    if (n == 0) {
      a.add(target);
      return true;
    }
    mAS(a,n-1,target + n);
    mAS(a,n-1,target);
    return false;
  }
}

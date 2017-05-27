import java.util.*;

public class GCD {
     private static long gcd_naive(long a, long b) {
  if(b==0)
      return a;
  

    return gcd_naive(b,a%b);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextInt();
    long b = scanner.nextInt();

    System.out.println(gcd_naive(a, b));
  }
}
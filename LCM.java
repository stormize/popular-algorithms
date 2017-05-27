import java.util.*;

public class LCM {
  private static long lcm_naive(long a, long b) {
    
           
    return (long) (a * b)/gcd_naive(a,b);
  }
    private static long gcd_naive(long a, long b) {
  if(b==0)
      return a;
  

    return gcd_naive(b,a%b);
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm_naive(a, b));
  }
}

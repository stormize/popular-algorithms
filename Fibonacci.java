import java.util.Scanner;

public class Fibonacci {
private static long calc_fib(int n) {
    if (n<=1)
      return n;
    long a=1;
    long b=1;
    for(int i =3 ; i<=n;i++){
      long x= a+b;
      a=b;
      b=x;
    }
    return b;
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}

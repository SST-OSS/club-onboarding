import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    solve(num1, num2);
  }

  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  public static void solve(int a, int b) {
    int n = gcd(a, b);
    System.out.println(n);
    System.out.println((a * b) / n);
  }
}

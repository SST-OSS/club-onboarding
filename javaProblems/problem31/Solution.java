import java.util.Scanner;

public class Solution{ 
  public int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  public int[]  solve(int num1, int num2) {
    int arr[] = new int[2];
    arr[0] = gcd(num1,num2);
    arr[1] = (num1*num2)/arr[0];
    return arr;
  }
}

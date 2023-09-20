public class Solution {
  public int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  public int[] solvee(int a, int b) {
    int[] arr = new int[2];  
    arr[0] = gcd(a, b);
    arr[1] = (a * b) / arr[0];
    return arr;
  }

  public int[] solve(int num1, int num2) {
    return solvee(num1, num2);
  }
}

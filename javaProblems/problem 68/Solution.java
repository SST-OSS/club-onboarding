public class Solution {
    public int solve(int N) {
        int reversed = 0;
        while (N != 0) {
            int digit = N % 10;
            reversed = reversed * 10 + digit;
            N /= 10;
        }
        return reversed;
    }
}

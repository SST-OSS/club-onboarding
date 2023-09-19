import java.util.Arrays;

public class Solution {
    public int solve(int[] A, int B) {
        int count = 0;
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i] + A[j] == B) {
                    count++;
                }
            }
        }
        return count;
    }
}

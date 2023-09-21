import java.util.*;

class Solution {
    int gcd(int a, int b) {
        for (int i = a; i >= 1; i--) {
            if (i > b) {
                i = b;
            }

            if (b % i == 0 && a % i == 0) {
                return i;
            }
        }

        return 1;
    }

    public int solve(int[] nums) {
        Arrays.sort(nums);
        return gcd(nums[0], nums[nums.length - 1]);
    }
}

public class Solution {
    public int solve(int n) {
        String string = Integer.toBinaryString(n);
        int count = 0;
        for (char digit : string.toCharArray()) {
            if (digit == '1') {
                count++;
            }
        }
        return count;
    }
}
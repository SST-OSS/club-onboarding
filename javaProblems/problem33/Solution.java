class Solution {
    public String solve(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (num > 0) {
            if (num >= values[i]) {
                int count = num / values[i];
                num -= values[i] * count;
                for (int j = 0; j < count; j++) {
                    result.append(symbols[i]);
                }
            } else {
                i++;
            }
        }
        return result.toString();
    }
}

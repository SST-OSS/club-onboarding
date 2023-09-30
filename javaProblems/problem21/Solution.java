public class Solution {
    public int findSmallestInteger() {
        int x = 1;
        while (true) {
            if (hasSameDigits(x, 2*x, 3*x, 4*x, 5*x, 6*x)) {
                return x;
            }
            x++;
        }
    }

    private boolean hasSameDigits(int... numbers) {
        String baseDigits = sortDigits(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            if (!baseDigits.equals(sortDigits(numbers[i]))) {
                return false;
            }
        }
        return true;
    }

    private String sortDigits(int number) {
        char[] digits = Integer.toString(number).toCharArray();
        java.util.Arrays.sort(digits);
        return new String(digits);
    }
}

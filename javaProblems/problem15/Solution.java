public class Solution {
    public int solve(int n) {
        int count = 0;
        int num = 2;

        while (true) {
            if (isPrime(num)) {
                count++;
                if (count == n) {
                    return num;
                }
            }
            num++;
        }
    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

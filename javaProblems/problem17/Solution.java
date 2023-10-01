public class Solution {
    public long sumPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        
        for (int i = 2; i*i < n; i++) {
            if (isPrime[i]) {
                for (int j = i*i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        long sum = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                sum += i;
            }
        }
        return sum;
    }
}

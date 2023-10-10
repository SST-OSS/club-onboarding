class Solution
{
	public static void printPrimeNumbers(int N) {
        for (int i = 2; i <= N; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i);
                if (i != N) {
                    System.out.print(", ");
                }
            }
        }
    }
 }

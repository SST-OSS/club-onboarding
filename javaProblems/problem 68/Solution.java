import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        while (n > 0) {
            int digit = n % 10; 
            System.out.println(digit); 
            n = n / 10; 
    public int solve(int N) {
        int reversed = 0;
        while (N != 0) {
            int digit = N % 10;
            reversed = reversed * 10 + digit;
            N /= 10;
        }

        sc.close();
        return reversed;
    }
}

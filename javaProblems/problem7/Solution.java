public class Solution { 
  public boolean solve(int n) {
    if(n == 0) return false;
    if((n > 0) && (n & (n - 1)) == 0) return true;
    return false;
  }
}

/*
The function solve aims to determine if a given integer n is a power of two.

    Checking for Zero:
    The first line checks if n is 0. The number 0 is not a power of two. So, if n is 0, the function immediately returns false.

    Bitwise Operation:
    The core logic for determining if n is a power of two is contained in the line that checks if (n > 0) && (n & (n - 1)) == 0.

        The condition (n > 0) ensures that n is positive. Negative numbers are not powers of two.

        The expression (n & (n - 1)) is a bitwise AND operation. Here's its significance:

            If n is a power of two, its binary representation has only one '1' bit. For instance, 
            1 is represented as 0001 in binary, 2 is 0010, 4 is 0100, 8 is 1000, and so on.

            Subtracting 1 from n flips all the bits after the rightmost '1' bit of n. 
            For example, for n = 4 (which is 0100 in binary), n-1 is 3 (0011 in binary). 
            Similarly, for n = 8 (1000 in binary), n-1 is 7 (0111 in binary).

            Performing a bitwise AND between n and n-1 will result in 0 if n is a power of two. 
            This is because the two numbers don't have any '1' bits in common.

    Return False:
    If neither of the above conditions is met, the function returns false. This indicates that n is not a power of two.

In summary, the function uses bitwise operations to efficiently determine if a number is a power of two. 
The key insight is that numbers which are powers of two have a unique binary representation with only one '1' bit, 
and this property can be exploited using bitwise operations.

*/

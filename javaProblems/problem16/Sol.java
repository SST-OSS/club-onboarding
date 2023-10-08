import java.math.BigInteger;

public class Sol{
    public int solve(int n) 
    {
        BigInteger f = BigInteger.ONE;
        for (int i = 2; i <= n; i++) 
        {
            f = f.multiply(BigInteger.valueOf(i));
        }
        String s = f.toString();
        int d = 0;
        for (int i = 0; i < s.length(); i++) 
        {
            d = d + Character.getNumericValue(s.charAt(i));
        }
        return d;
    }
}
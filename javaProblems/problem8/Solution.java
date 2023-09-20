public class Solution {
    public boolean solve(int n) {

        double a = n;
        while(a > 1)
        {
            a = a/4;
        }
        if(a != 1)
        {
            return false;
        }
        return true;
    }
}

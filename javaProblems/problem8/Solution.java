public class Solution {
    public boolean solve(int n) {

        double num = n;
       if (num <= 0) {
            return false;
        }

        while (num % 4 == 0) {
            num /= 4;
        }

        if(num==1){
            return true;
    }
        else{
            return false;
}
    }
}

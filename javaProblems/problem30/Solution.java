class Solution {
    public boolean solve(int n) {
        boolean a=false;
        int i=1;
        while(i<n){
            i=1;
            if(n%i==0){
                n=n-i;
                if(a){
                    a=false;
                }else{
                    a=true;
                }
                continue;
            }
            i++;
        }
        return a;
    }
}

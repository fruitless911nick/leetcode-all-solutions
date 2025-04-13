class Solution {
    public int subtractProductAndSum(int n) {
        
        int c=1,s=0,t;
        while(n>0){
            t=n%10;
            c=t*c;
            s=s+t;
            n=n/10;
        }
        return c-s;
   
    }
}
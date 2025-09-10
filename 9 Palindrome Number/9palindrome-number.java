class Solution {
    public boolean isPalindrome(int x) {
        if(isPalin(x)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isPalin(int x){
        int n=x;
        int s=0;
        while(n>0){
            int d=n%10;
            s=s*10+d;
            n=n/10;
        }
        if(s==x){
            return true;
        }
        else{
            return false;
        }
    }
}
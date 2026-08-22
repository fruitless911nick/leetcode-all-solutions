class Solution {
    public boolean checkDivisibility(int n) {
        int mul=1;
        int sum=0;
        int temp=n;
        while(temp>0){
            mul*=temp%10;
            sum+=temp%10;
            temp/=10;
        }
        if(n%(mul+sum)==0){
            return true;
        }
        else{
            return false;
        }
       
    }
}
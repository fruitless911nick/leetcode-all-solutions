class Solution {
    public boolean isPerfectSquare(int num) {
        long left=1;
        long end=num;
        while(left<=end){
            long mid=left+(end-left)/2;
            long square=mid*mid;
            if(square==num){
                return true;
            }
            else if(square<num){
                left=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
}
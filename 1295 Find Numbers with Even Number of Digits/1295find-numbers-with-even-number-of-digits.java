class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    public boolean even(int num){
        int noDigits=noDigit(num);
        if(noDigits%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public int noDigit(int n){
        return (int)(Math.log10(n))+1;
    }
}
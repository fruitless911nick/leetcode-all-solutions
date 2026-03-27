class Solution {
    public int longestNiceSubarray(int[] nums) {
        int arrLen=1;
        int left=0;
        int mask=0;
        for(int right=0;right<nums.length;right++){
                while((mask & nums[right])!=0){
                    mask=mask^nums[left];
                    left++;
                }
            mask=mask|nums[right];
            arrLen=Math.max(arrLen,right-left+1);
        }
        return arrLen;
    }
}
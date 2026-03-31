class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double curSum=0;
        double maxAvg=Double.NEGATIVE_INFINITY;
        int left=0;
        for(int right=0;right<nums.length;right++){
            curSum+=nums[right];
            if(right-left+1>k){
                curSum-=nums[left];
                left++;
            }
            if(right-left+1==k){
                maxAvg=Math.max(maxAvg,curSum/k);
            }
        }
        return maxAvg;
    }
}
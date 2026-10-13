class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long positiveSum=0;
        long negativeSum=0;
        int mid=n/2;
        // Calculate squaring of smaller part
        for(int i=0;i<mid;i++){
            negativeSum+=nums[i];
        }
        // Calculate larger part
        for(int i=mid;i<n;i++){
            positiveSum+=nums[i];
        }
        return positiveSum-negativeSum;
    }
}
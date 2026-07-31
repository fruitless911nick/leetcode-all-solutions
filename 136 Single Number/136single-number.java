class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int ans=0;
        for(int item:nums){
            ans=ans^item;
        }
        return ans;
    }
}
class Solution {
    public int findMin(int[] nums) {
        int s=0;
        int l=nums.length-1;
        while(s<l){
            int m=s+(l-s)/2;

            if(nums[m]>nums[l]){
                s=m+1;
            }
            else{
                l=m;
            }
        }
        return nums[s];
    }
}
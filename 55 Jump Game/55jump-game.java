class Solution {
    public boolean canJump(int[] nums) {
        int last=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            int curJump=i+nums[i];
            if(last<=curJump){
                last=i;
            }
        }
        return last==0;
    }
}
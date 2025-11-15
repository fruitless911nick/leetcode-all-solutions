class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int longest=0,count=0;
         for (int right = 0; right < nums.length; right++) {
                if(nums[right]==1){
                    count++;
                    longest=Math.max(longest,count);
                }
                else{
                    count=0;
                }
         }
         return longest;
    }
}
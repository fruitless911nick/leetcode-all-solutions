class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
        for(int i:nums){
            max=Math.max(i,max);
        }
        int moves=0;
        for(int j:nums){
            moves+=(max-j);
        }
        return moves;
    }
}
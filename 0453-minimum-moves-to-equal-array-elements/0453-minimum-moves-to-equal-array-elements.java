class Solution {
    public int minMoves(int[] nums) {
        int min= nums[0];
        for(int i:nums){
            min=Math.min(i,min);
        }
        int moves=0;
        for(int j:nums){
            moves+=j-min;
        }
        return moves;
    }
}
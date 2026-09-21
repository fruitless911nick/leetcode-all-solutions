class Solution {

    public int maxAbsoluteSum(int[] nums) {

     

    int minRes = kadaneMin(nums);
    int maxRes = kadaneMax(nums);

    

    return Math.max(Math.abs(minRes), maxRes);

    }

    public int kadaneMin(int[] nums) {

        int bestMin = nums[0];
        int res=nums[0];

        for (int i = 1; i < nums.length; i++) {
            bestMin = Math.min(bestMin + nums[i], nums[i]);
            res=Math.min(bestMin,res);
        }

        return res;
    }

    public int kadaneMax(int[] nums) {

        int bestMax = nums[0];
        int res=nums[0];

        for (int i = 1; i < nums.length; i++) {
            bestMax = Math.max(bestMax + nums[i], nums[i]);
            res=Math.max(bestMax,res);

        }

        return res;
    }
}
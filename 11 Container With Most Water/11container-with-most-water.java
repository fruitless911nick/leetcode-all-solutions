class Solution {
    public int maxArea(int[] height) {
         int n= height.length;
        int l=0,r=n-1;
        int maxWater=0;

        while (l<r){
            int water=(r-l)*Math.min(height[l],height[r]);
            maxWater=Math.max(maxWater,water);
            if(height[l]<=height[r]){
                l++;
            }
        else{
            r--;
        }
        }
        return maxWater;
    }
}
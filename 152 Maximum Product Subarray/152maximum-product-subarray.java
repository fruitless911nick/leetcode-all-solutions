class Solution {
    public int maxProduct(int[] nums) {
         int maxMulti=Integer.MIN_VALUE;
      int right;
      int multi=1;
      // left to right
      for (right=0;right< nums.length;right++){
          multi=multi*nums[right];
          maxMulti=Math.max(multi,maxMulti);
          if(multi==0){
              multi=1;
          }

      }

      // right to left
        multi=1;
        for (right=nums.length-1;right>=0 ;right--){
            multi=multi*nums[right];
            maxMulti=Math.max(multi,maxMulti);
            if(multi==0){
                multi=1;
            }
        }


      return maxMulti;
    }
}
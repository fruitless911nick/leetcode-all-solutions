class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
    return 0;
        int n=nums.length;
        int low=0;
        int uniq=1;
        int mover=1;
        int k=1;
        while(mover<n){
            if(nums[mover]==nums[mover-1]){
                if(k<2){
                    nums[++low]=nums[mover];
                    k++;
                    mover++;
                    uniq++;
                }
                else{
                    mover++;
                }
            }
            else {
                 k=1;
                nums[++low]=nums[mover];
                mover++;
                uniq++;
            }
        }
        return uniq;
    }
}
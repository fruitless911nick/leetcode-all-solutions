class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr1=new int[2*nums.length];
        int i=0;
        while(i<2*nums.length) {
            for (int j = 0; j < nums.length; j++) {

                    arr1[i] = nums[j];
                    i++;

            }
        }

return arr1;
    }
}
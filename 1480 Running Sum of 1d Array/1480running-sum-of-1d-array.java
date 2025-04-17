class Solution {
    public int[] runningSum(int[] nums) {
        int s;
        int[] arr=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            s=0;
            for (int j = 0; j <= i; j++) {
                s+=nums[j];
            }
            arr[i]=s;
        }
        return arr;
    }
}
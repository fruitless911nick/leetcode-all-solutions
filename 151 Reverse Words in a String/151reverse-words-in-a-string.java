class Solution {
    public String reverseWords(String s) {
         s=s.trim();
        String[] nums=s.split("\\s+");
        int left=0;
        int right=nums.length-1;
        while(left<right){
            String temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        return  String.join(" ",nums);
    }
}
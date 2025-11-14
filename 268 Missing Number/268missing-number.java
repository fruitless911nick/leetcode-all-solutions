class Solution {
    public int missingNumber(int[] nums) {
         Set<Integer> st=new HashSet<>();
        for(int item:nums){
            st.add(item);
        }
        int n=nums.length;
        for (int i = 0; i <= n; i++) {
         if(!st.contains(i)){
             return i;
         }
        }
        return -1;
    }
}
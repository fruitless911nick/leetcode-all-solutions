class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        boolean flag=false;
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
             flag=true;
            }
            else{
                map.put(nums[i],0);
            }
        }
        return flag;
    }
}
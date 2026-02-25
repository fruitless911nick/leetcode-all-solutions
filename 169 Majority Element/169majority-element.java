class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int temp:nums){
                map.put(temp,map.getOrDefault(temp,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>n/2){
              ans=entry.getKey();
            }
        }
        return ans;
    }
}
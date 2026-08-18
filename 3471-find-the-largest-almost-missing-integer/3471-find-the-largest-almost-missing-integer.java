class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int low=0;
        for(int high=0;high<nums.length;high++){
            if(high-low+1==k){
                // Set ke andar daal do
                HashSet<Integer> set=new HashSet<>();
                for(int i=low;i<=high;i++){
                    set.add(nums[i]);
                }
                for(int num:set){
                    map.put(num,map.getOrDefault(num,0)+1);
                }
                low++;
            }
        }
            int ans=-1;
            for(int num:map.keySet()){
            if(map.get(num)==1){
                ans=Math.max(ans,num);
            }
            }
            
        return ans;
    }
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int temp:nums){
                map.put(temp,map.getOrDefault(temp,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>n/3){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}
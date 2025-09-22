class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int num:nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                map.replace(num,(map.get(num))+1);
            }
        }
        int maxi=0;
        ArrayList<Integer> list=new ArrayList<>(map.values());
        for(int l1:list) {
            maxi = Math.max(maxi, l1);
        }
        int sum=0;
        for (int l2:list){
            if(maxi==l2){
                sum+=maxi;
            }
        }
        return sum;
    }
}
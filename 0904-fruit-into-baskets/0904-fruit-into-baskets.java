class Solution {
    public int totalFruit(int[] fruits) {
        int low=0;
        int res=Integer.MIN_VALUE;
        int k=2;
        HashMap<Integer,Integer> basket=new HashMap<>();
        
        for(int high=0;high<fruits.length;high++){
            basket.put(fruits[high],basket.getOrDefault(fruits[high],0)+1);
            while(basket.size()>k){
                basket.put(fruits[low],basket.get(fruits[low])-1);
                if(basket.get(fruits[low])==0){
                    basket.remove(fruits[low]);
                }
                low++;
            }
            if(basket.size()==k || basket.size()<k){
                int len=high-low+1;
                res=Math.max(res,len);
            }
        }
        return res;
    }
}
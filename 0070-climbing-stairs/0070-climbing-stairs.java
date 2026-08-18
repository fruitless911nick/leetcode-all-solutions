class Solution {
        HashMap<Integer,Integer> map=new HashMap<>();
        public Solution(){
        map.put(0,1);
        map.put(1,1);
        map.put(2,2);
        }
    public int climbStairs(int n) {
        if(map.containsKey(n)){
            return map.get(n);
        }
        
        else{
            int v=climbStairs(n-1)+climbStairs(n-2);
            map.put(n,v);
            return map.get(n);
        }
        
    }
}
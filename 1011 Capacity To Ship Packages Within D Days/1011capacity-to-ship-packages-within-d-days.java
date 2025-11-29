class Solution {
    public int shipWithinDays(int[] weight, int days) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int temp:weight){
            low=Math.max(low,temp);
            high+=temp;
        }
        while(low<=high){
            int capacity=low+(high-low)/2;
            if(canShipCarry(weight,days,capacity)){
                high=capacity-1;
            }
            else{
                low=capacity+1;
            }
        }
          return low;
        }
    static boolean canShipCarry(int[] weight,int days,int capacity){
        int day=1;
        int load=0;
        for(int temp:weight){
            if(load+temp>capacity){
                day++;
                load=0;
            }
            load+=temp;
        }
        return day<=days;

    }
}
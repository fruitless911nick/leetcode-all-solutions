class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            if(max<i){
                max=i;
            }
             if(min>i){
                min=i;
            }
        }
        while(max%min!=0){
            int rem=max%min;
            max=min;
            min=rem;
        }  
        return min;     
    }
}
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long total=(long) m*k;
        if(total> bloomDay.length){
            return -1;
        }
       int s=Integer.MAX_VALUE;
        int l=Integer.MIN_VALUE;
        for(int x:bloomDay){
             s=Math.min(x,s);
             l=Math.max(x,l);
        }
        int ans=-1;
        while(s<=l){
            int mid=s+(l-s)/2;
            if(canMakeBouquets(bloomDay,m,k,mid)){
                ans=mid;
                l=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }

    static boolean canMakeBouquets(int[] bloomDay, int m, int k, int mid) {
        int count=0;
        int bouqtes=0;
        for(int x:bloomDay){
            if(x<=mid){
                count++;
                if(count==k){
                    bouqtes++;
                    count=0;
                }
                }
                else{
                    count=0;
                }
            }
        
        return bouqtes>=m;
    }
}
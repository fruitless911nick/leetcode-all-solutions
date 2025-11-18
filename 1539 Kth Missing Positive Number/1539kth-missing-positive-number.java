class Solution {
    public int findKthPositive(int[] arr, int k) {
          for (int i = 0; i < arr.length; i++) {
             int miss=arr[i]-(i+1);
             if(miss>=k){
                 return k+i;
             }
         }
         return k+ arr.length;
    }
}
class Solution {
    public int[] sortArray(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        int mid = nums.length / 2;
        int[] first=sortArray(Arrays.copyOfRange(nums,0,mid));
        int[] second=sortArray(Arrays.copyOfRange(nums,mid,nums.length));

        return merge(first,second);
    }

     static int[] merge(int[] first, int[] second) {
        int[] res=new int[first.length+second.length];
        int i=0,j=0,k=0;
        while(i< first.length && j< second.length){
            if(first[i]<second[j]){
                res[k]=first[i];
                i++;
                k++;
            }
            else{
                res[k]=second[j];
                j++;
                k++;
            }
        }
        while(i< first.length){
            res[k]=first[i];
            i++;
            k++;
        }
         while(j< second.length){
             res[k]=second[j];
             j++;
             k++;
         }
         return res;
    }
}
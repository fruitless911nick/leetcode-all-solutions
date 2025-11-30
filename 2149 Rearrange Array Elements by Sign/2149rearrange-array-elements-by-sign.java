class Solution {
    public int[] rearrangeArray(int[] nums) {
         int[] pos=new int[nums.length/2];
        int[] neg=new int[nums.length/2];
        int i=0,j=0;
        for(int temp:nums){
            if(temp<0){
                neg[j]=temp;
                j++;
            }
            else{
                pos[i]=temp;
                i++;
            }
        }
        int a=0,b=0,k=0;
        int[] ans=new int[nums.length];
        while(a<pos.length && b<neg.length){
            ans[k++]=pos[a++];
            ans[k++]=neg[b++];
        }
        return ans;
    }
}
class Solution {
    public int maximumSum(int[] arr) {
        int n=arr.length;
        int res=arr[0];
        int noDel=arr[0];
        int oneDel=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
           int prevNoDel=noDel;
            int prevOneDel=oneDel;
                // No Deletion
            noDel=Math.max(prevNoDel+arr[i],arr[i]);
                // One Deletion
           oneDel=Math.max(prevOneDel==Integer.MIN_VALUE?Integer.MIN_VALUE:prevOneDel+arr[i],prevNoDel);
           res=Math.max(res,Math.max(noDel,oneDel));
        }
        return res;
    }
}
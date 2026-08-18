class Solution {
    public int characterReplacement(String s, int k) {
        int low=0,res=Integer.MIN_VALUE;
        int n=s.length();
        int maxFreq=0;
        int[] arr=new int[26];
        int high;
        for(high=0;high<n;high++){
            char ch=s.charAt(high);
            arr[ch-'A']++;
            maxFreq=Math.max(maxFreq,arr[ch-'A']);
            int len=high-low+1;
            int diff=len-maxFreq;
            while(diff>k){
                arr[s.charAt(low)-'A']--;
                low++;
               len=high-low+1;
              diff=len-maxFreq;
            }
            res = Math.max(res, len);
        }
        return res;
    }
}
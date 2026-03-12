class Solution {
    public int firstUniqChar(String s) {
          int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';
            arr[idx]=arr[idx]+1;
        }
        for(int j=0;j<s.length();j++){
            if(arr[s.charAt(j)-'a']==1){
                return j;
            }
        }
        return -1;
    }
}
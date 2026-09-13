class Solution {
    public String longestPalindrome(String s) {
        StringBuilder st=new StringBuilder(s);
        int n=s.length();
        StringBuilder r=new StringBuilder();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                if (j - i <= r.length()) {
                    continue;
                }
            StringBuilder res=new StringBuilder((st.substring(i,j)));
            if(checkPalin(res)){
                if(r.length()<res.length()){
                    r=res;
                }
            }
         }
         }
         return r.toString();
        }
        
    
    public boolean checkPalin(StringBuilder in){
        int low=0;
        int high=in.length()-1;
        while(low<high){
            if(in.charAt(low)!=in.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
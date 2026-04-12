class Solution {
    public int minInsertions(String s) {
        return s.length()-lps(s);
    }
     int lps(String s) {
        StringBuilder a= new StringBuilder(s);
        StringBuilder b=new StringBuilder(s);
        b.reverse();
        return lcs(a,b);
    }

    int lcs(StringBuilder a, StringBuilder b) {
        int m= a.length(),n=b.length();
        int[][] dp=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j]=-1;
            }
        }
        return LCS(m-1,n-1,a,b,dp);
    }

    int LCS(int i, int i1, StringBuilder a, StringBuilder b, int[][] dp) {
        if(i<0 || i1<0){
            return 0;
        }
        if(dp[i][i1]!=-1){
            return dp[i][i1];
        }
        if(a.charAt(i)==b.charAt(i1)){
            return 1+ LCS(i-1,i1-1,a,b,dp);
        }
        else{
            return dp[i][i1]=Math.max(LCS(i-1,i1,a,b,dp),LCS(i,i1-1,a,b,dp));
        }
    }
}
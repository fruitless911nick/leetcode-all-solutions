class Solution {
    public int numTrees(int n) {
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                int lft=j-1;
                int rght=i-j;
                dp[i]+=dp[lft]*dp[rght];
            }
        }
        return dp[n];
    }
}
class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int j=accounts[0].length;
        int maxWealth=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            int sum=0;
            for(int k=0;k<j;k++){
                sum+=accounts[i][k];
                maxWealth=Math.max(sum,maxWealth);
            }
        }
        return maxWealth;
    }
}
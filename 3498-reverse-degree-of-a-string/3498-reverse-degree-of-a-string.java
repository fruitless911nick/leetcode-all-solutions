class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            int z='z'-s.charAt(i)+1;
            sum+=z*(i+1);
        }
          return sum;
    }
  
}
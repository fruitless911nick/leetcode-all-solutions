class Solution {
    public String multiply(String nums1, String nums2) {
        if(nums1.equals("0")||nums2.equals("0")){
            return "0";
        }
        int m=nums1.length();
        int n=nums2.length();
        int[] result=new int[m+n];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int mul=(nums1.charAt(i)-'0')*(nums2.charAt(j)-'0');
                int sum=mul+result[i+j+1]; // i+j+1 denotes current position
                result[i+j+1]=sum%10;
                result[i+j]+=sum/10; // extract carry
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int digit:result){
            if(ans.length()==0 && digit==0){
                continue;
            }
            ans.append(digit);
        }
        return ans.toString();
    }
}
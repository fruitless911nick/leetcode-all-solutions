class Solution {
    public boolean isPalindrome(String s) {
        String low=s.toLowerCase();
        StringBuilder in=new StringBuilder();
        for(int i=0;i<low.length();i++){
            if(Character.isLetterOrDigit(low.charAt(i))){
                 in.append(low.charAt(i));
            }
            else{
                 continue;
            }
        }
        int left=0,right=in.length()-1;
        while(left<=right){
            if(in.charAt(left)==in.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
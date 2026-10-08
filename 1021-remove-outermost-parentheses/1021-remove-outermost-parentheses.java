class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int balance=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                // If balance > 0, this is NOT outermost
                if(balance>0){
                    sb.append(ch);
                }
                balance++;
            }
            else{
                balance--;
                 // If balance > 0, this is NOT outermost
                if(balance>0){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}
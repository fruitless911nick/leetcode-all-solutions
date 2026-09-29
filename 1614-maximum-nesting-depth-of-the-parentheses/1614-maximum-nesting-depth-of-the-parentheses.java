class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack=new Stack<>();
        int n=s.length();
        int nb=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
                nb++;
                ans=Math.max(ans,nb);
            }
            else if(s.charAt(i)==')'){
                if(stack.peek()=='('){
                    stack.pop();
                    nb--;
                }
             
            }
        }
        return ans;
    }
}
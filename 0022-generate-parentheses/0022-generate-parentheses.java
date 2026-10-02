class Solution {
    public List<String> generateParenthesis(int n) {
         List<String> ans=new ArrayList<>();
        generate("",0,0,n,ans);
        return ans;
    }
private static void generate(String res,int l,int r,int n,List<String> ans){
        if(r==n){
            ans.add(res);
            return;
        }
        if(l<n){
            generate(res+"(",l+1,r,n,ans);
        }
        if(r<l){
            generate(res+")",l,r+1,n,ans);
        }
    }
}
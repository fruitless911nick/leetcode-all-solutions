class Solution {
    public char findTheDifference(String s, String t) {
        char[] ch=s.toCharArray();
        char ans=0;
        for(char c:ch){
            ans=(char)(ans^c);
        }
        char[] chr=t.toCharArray();
        for(char th:chr){
            ans=(char)(ans^th);
        }
        return ans;
    }
}
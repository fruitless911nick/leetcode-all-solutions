class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        StringBuilder res=new StringBuilder();
        res.append(word1.charAt(0));
        i++;
        while(i<word1.length() && j<word2.length()){
            if(i>j){
                res.append(word2.charAt(j));
                j++;
            }
            res.append(word1.charAt(i));
            i++;
        }
        while(i<word1.length()){
            res.append(word1.charAt(i));
            i++;
        }
        while(j<word2.length()){
            res.append(word2.charAt(j));
            j++;
        }
        return res.toString();
    }
}
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int[] frq=new int[26];
       for(char ch:magazine.toCharArray()){
        frq[ch-'a']++;
       } 
       for(char ch:ransomNote.toCharArray()){
        if(frq[ch-'a']==0){
            return false;
        }
        frq[ch-'a']--;
       }
              return true;

    }
}
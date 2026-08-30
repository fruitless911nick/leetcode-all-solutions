class Solution {
    public String toGoatLatin(String sentence) {
        // extracting words in array
        String[] words=sentence.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            if(!isVowel(word.charAt(0))){
                word=word.substring(1)+word.charAt(0);
            }
            word+="ma";
            for(int j=0;j<=i;j++){
                word+='a';
            }
            res.append(word);
            if(i!=words.length-1){
                res.append(" ");
            }
        }
        return res.toString();
    }
    public boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }
}
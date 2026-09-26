class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        HashMap<Character,String> map=new HashMap<>();
        HashMap<String,Character> revMap=new HashMap<>();

        // for s to pattern check
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String item=words[i];
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(item)){
                    return false;
                }
            }
            else{
                map.put(ch,item);
            }
        }
       // for pattern to s check
        for(int i=0;i<words.length;i++){
             char ch=pattern.charAt(i);
            String item=words[i];
            if(revMap.containsKey(item)){
                if(!revMap.get(item).equals(ch)){
                    return false;
                }
            }
            else{
                revMap.put(item,ch);
            }
        }
        return true;
    }
}
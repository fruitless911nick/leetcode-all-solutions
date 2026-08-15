class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int k=s1.length();
        HashMap<Character,Integer> map=new HashMap<>();
         HashMap<Character,Integer> window=new HashMap<>();

        // for characters frequency in s1
        for(char c:s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int low=0;
        int high=0;
        while(high<s2.length()){
            char c=s2.charAt(high);
            window.put(c,window.getOrDefault(c,0)+1);
            high++;
            if(high-low==k){
                if(map.equals(window)){
                    return true;
                }
                // remove from low side
                char remove=s2.charAt(low);
                window.put(remove,window.get(remove)-1);
                // zero frequency wale character ko remove karna
                if(window.get(remove)==0){
                    window.remove(remove);
                }
                low++;
            }
        }
       return false; 
    }
}
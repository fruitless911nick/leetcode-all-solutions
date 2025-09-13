class Solution {
    public int maxFreqSum(String s) {
        int countVowel=0,countConsonant=0;
        HashMap<Character, Integer> vowel = new HashMap<>();
        HashMap<Character, Integer> consonant = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'i' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                if (vowel.containsKey(s.charAt(i))) {
                    vowel.put(s.charAt(i), (vowel.get(s.charAt(i))) + 1);
                } else {
                    vowel.put(s.charAt(i), 1);
                }
            } else {
                if (consonant.containsKey(s.charAt(i))) {
                    consonant.put(s.charAt(i), (consonant.get(s.charAt(i))) + 1);
                } else {
                    consonant.put(s.charAt(i), 1);
                }
            }
        }
        List<Integer> list1=new ArrayList<>(vowel.values());
        List<Integer> list2=new ArrayList<>(consonant.values());
        for(int l1:list1){
            countVowel=Math.max(countVowel,l1);
        }
        for (int l2:list2){
            countConsonant=Math.max(countConsonant,l2);
        }
        return countVowel+countConsonant;
    }
}
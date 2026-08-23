class Solution {
    public String reverseOnlyLetters(String s) {
        int low = 0;
        int high = s.length() - 1;
        StringBuilder res = new StringBuilder(s);
        while (low < high) {
            if (!Character.isLetter(res.charAt(low))) {
                low++;
                continue;
            }
            if (!Character.isLetter(res.charAt(high))) {
                high--;
                continue;
            }
            char temp = res.charAt(low);
            res.setCharAt(low,res.charAt(high));
            res.setCharAt(high,temp);
            low++;
            high--;
        }
        return res.toString();
    }
}
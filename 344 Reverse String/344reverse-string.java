class Solution {
    public void reverseString(char[] s) {
          int start=0,end=s.length-1;
         System.out.println(reverseHelper(s,start,end));

    }
    static char[] reverseHelper(char[] s,int start,int end){
       if(start>=end){
           return s;
       }
       char temp=s[start];
       s[start]=s[end];
       s[end]=temp;
       return reverseHelper(s,start+1,end-1);

    }
    }

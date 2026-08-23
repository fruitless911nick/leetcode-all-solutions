class Solution {
    public String addStrings(String num1, String num2) {
        int n1=num1.length();
        int n2=num2.length();
        StringBuilder res=new StringBuilder();
        int carry=0;
        if(n1==n2){
            for(int i=n1-1;i>=0;i--){
                int digit1=num1.charAt(i)-'0';
                int digit2=num2.charAt(i)-'0';
                int sum=digit1+digit2+carry;
                res.append(sum%10);
                carry=sum/10;
            }
        }
        if(n1!=n2){
            int i=n1-1;
            int j=n2-1;
            
            while(i>=0 || j>=0){
                int digit1=0;
            int digit2=0;
            if(i>=0){
                digit1=num1.charAt(i)-'0';
            }
            if(j>=0){
                digit2=num2.charAt(j)-'0';
            }
            int sum=digit1+digit2+carry;
            res.append(sum%10);
            carry=sum/10;
            i--;
            j--;
            }
        }
        if(carry>0){
                res.append(carry);
            }
            return res.reverse().toString();
    }
}
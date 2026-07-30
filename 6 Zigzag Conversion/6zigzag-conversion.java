class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows==1 || numRows>=s.length()){
            return s;
        }
        StringBuilder[] row=new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            row[i]=new StringBuilder();
        }
        boolean goingDown=true;
        int size=s.length();
        int currentRows=0;
        for (int i = 0; i < size; i++) {
            row[currentRows].append(s.charAt(i));
            if(currentRows==0){
                goingDown=true;
            }
           else if(currentRows==numRows-1){
                goingDown=false;
            }
            if(goingDown){
                currentRows++;
            }
            else {
                currentRows--;
            }
        }
        StringBuilder result=new StringBuilder();
        for(StringBuilder r:row){
            result.append(r);
        }
        return result.toString();
    }
}
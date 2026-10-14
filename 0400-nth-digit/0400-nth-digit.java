class Solution {
    public int findNthDigit(int n) {
        int digits=1; // denotes group number
        long count=9;  // denotes no. of elements in the group
        long start=1; // denotes 1st member of current group
        while(n>digits*count){
            n-=digits*count;
            digits++;
            count=count*10;
            start=start*10;
        }
        // Actual number
        long number=start+(n-1)/digits;
        int idx=(int)((n-1)%digits);
        return String.valueOf(number).charAt(idx)-'0';
    }
}
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=n*n;
        int sumEven=sumOdd+n;
        return gcd(sumOdd,sumEven);
    }

    private static int gcd(int sumOdd, int sumEven) {
        if(sumOdd==0){
            return sumEven;
        }
        return gcd(sumEven%sumOdd,sumOdd);
    }
}
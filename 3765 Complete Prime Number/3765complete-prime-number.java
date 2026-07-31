class Solution {
    public boolean completePrime(int num) {
        String s=String.valueOf(num);
        // Calculating prefixes
        for (int i = 1; i < s.length(); i++) {
            String prefixs=s.substring(0,i);
            int value=Integer.parseInt(prefixs);
            if(!isPrime(value)){
                return false;
            }
        }
        // Calculating suffixes
        for (int i = 0; i < s.length(); i++) {
            String suffix=s.substring(i);
            int value=Integer.parseInt(suffix);
            if(!isPrime(value)){
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime(int value) {
        if(value<=1){
            return false;
        }
        for(int i=2;i*i<=value;i++){
            if(value%i==0){
                return false;
            }
        }
        return true;
    }
}
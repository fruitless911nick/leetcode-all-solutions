class Solution {
    public double myPow(double base, int expo) {
        if(expo<0){
            return 1/(pow(base,expo));
        }
        else{
            return pow(base,expo);
        }
    }
    private static double pow(double base,int expo){
        if(expo==0){
            return 1;
        }
        double call= pow(base,expo/2);
        if(expo%2==0){
            return call*call;
        }
        else{
            return call*call*base;
        }
    }
}
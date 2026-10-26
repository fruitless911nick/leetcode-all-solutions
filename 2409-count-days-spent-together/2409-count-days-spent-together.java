class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aliceStart=convert(arriveAlice);
        int aliceEnd=convert(leaveAlice);
        int bobStart=convert(arriveBob);
        int bobEnd=convert(leaveBob);
        int start=Math.max(aliceStart,bobStart);
        int end=Math.min(aliceEnd,bobEnd);
        if(start>end){
            return 0;
        }
        return end-start+1;
    }
    private int convert(String date){
            int month=Integer.parseInt(date.substring(0,2));
            int day=Integer.parseInt(date.substring(3,5));
            int[] daysBeforeMonth={0,31,59,90,120,151,181,212,243,273,304,334};
            return daysBeforeMonth[month-1]+day;
        }
}
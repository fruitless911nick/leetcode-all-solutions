class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] res=new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            int count=image[0].length-1;
            for (int j = 0; j < image[0].length; j++) {
                if(image[i][j]==1){
                res[i][count--]=0;
                }
                else{
                    res[i][count--]=1;
                }
            }
        }
        return res;
    }
}
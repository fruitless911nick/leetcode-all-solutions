class Solution {
    public List<Integer> spiralOrder(int[][] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int i,top=0,left=0,bottom= nums.length-1,right=nums[0].length-1;
        while(top<=bottom && left<=right) {
            // going from left to right
            for(i=left;i<=right;i++){
                list.add(nums[top][i]);
            }
            top++;
            // going top to bottom
            for(i=top;i<=bottom;i++){
                list.add(nums[i][right]);
            }
            right--;
            // going from right to left
            if(top<=bottom){
                for(i=right;i>=left;i--){
                    list.add(nums[bottom][i]);
                }
            }
            bottom--;
            if(left<=right){
                for(i=bottom;i>=top;i--){
                    list.add(nums[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}
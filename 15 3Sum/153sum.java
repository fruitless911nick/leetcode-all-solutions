class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();

        int n= nums.length;
        if(n<3){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        for (int i = 0; i <n-2 ; i++) {
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int n1=nums[i];
            int target=-n1;
            twoSum(nums,target,i+1,n-1,result);
        }
        return result;
    }

    private static void twoSum(int[] nums, int target, int i, int i1,List<List<Integer>> result) {
       while(i<i1){
           if(nums[i]+nums[i1]>target){
               i1--;
           }
          else if(nums[i]+nums[i1]<target){
               i++;
           }
          else{
             while(i<i1 && nums[i]==nums[i+1]){
                 i++;
             }
               while(i<i1 && nums[i1]==nums[i1-1]){
                   i1--;
               }
               result.add(Arrays.asList(-target,nums[i],nums[i1]));
               i++;
               i1--;
           }
       }
    }
    }

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
          List<List<Integer>> list=new ArrayList<>();
         createSubsets(nums,0,list,new ArrayList<>());
         return list;
    }

    private static void createSubsets(int[] nums, int i, List<List<Integer>> list,List<Integer> current) {

        if(i==nums.length){
            list.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[i]);
        createSubsets(nums,i+1,list,current);

        // backtrack

        current.remove(current.size()-1);
        // skipping element
        createSubsets(nums,i+1,list,current);
    }
}
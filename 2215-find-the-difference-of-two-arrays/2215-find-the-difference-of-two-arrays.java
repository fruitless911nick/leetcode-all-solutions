class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int n=nums1.length;
        List<List<Integer>> list=new ArrayList<>();
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i1:nums1){
            set1.add(i1);
        }
        for(int i2:nums2){
            set2.add(i2);
        }
        ArrayList<Integer> l1=new ArrayList<>();
        for(int item:set1){
            if(!set2.contains(item)){
                l1.add(item);
            }
        }
        list.add(l1);
        ArrayList<Integer> l2=new ArrayList<>();

         for(int item:set2){
            if(!set1.contains(item)){
                l2.add(item);
            }
        }
        list.add(l2);
        return list;
    }
}
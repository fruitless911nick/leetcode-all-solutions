class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        if(nums1.length>nums2.length||nums1.length==nums2.length){
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums1[i] == nums2[j]) {
                        if(!list.contains(nums1[i])) {
                            list.add(nums1[i]);
                        }
                    }
                }
            }
        }
        if(nums2.length>nums1.length){
            for (int i = 0; i < nums2.length; i++) {
                for (int j = 0; j < nums1.length; j++) {
                    if (nums2[i] == nums1[j]) {
                        if(!list.contains(nums1[j])) {
                            list.add(nums1[j]);
                        }
                    }
                }
            
        }
        }
            int k = list.size();
            int[] res = new int[k];
            int curr = 0;
            for (int t = 0; t < k; t++) {
                res[curr] = list.get(t);
                curr++;
            }

            return res;
        }
    }

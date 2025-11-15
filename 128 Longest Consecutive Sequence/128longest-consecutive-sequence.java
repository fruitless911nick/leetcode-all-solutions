class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=0;
        Set<Integer> st=new HashSet<>();
        for(int item:nums){
            st.add(item);
        }

        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int value=nums[i];
            int count=0;
            if(mp.containsKey(value)){
                continue;
            }

            while(st.contains(value)){
                if(mp.containsKey(value)){
                    int nxtLength=mp.get(value);
                    count+=nxtLength;
                    break;
                }
                count+=1;
                mp.put(value,0);
                value++;
            }
            mp.put(nums[i],count );
            longest=Math.max(longest,count);
        }

        return longest;
    }
}
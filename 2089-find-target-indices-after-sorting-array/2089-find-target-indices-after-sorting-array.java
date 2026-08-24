class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> ans=new ArrayList<>();
       
        // first occur of target
        int first=firstOccurrence(nums,target);
        // last occur of target
        int last=lastOccurrence(nums,target);
        if(first==-1){
            return ans;
        }
        for(int i=first;i<=last;i++){
            ans.add(i);
        }
        return ans;
    }
    public int firstOccurrence(int[] nums,int target){
       int low=0,high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
          if(nums[mid]==target){
            ans=mid;
              }
              high=mid-1;
            }
           else{
            low=mid+1;
           }
        }
        return ans;
    }
    public int lastOccurrence(int[] nums,int target){
        int low=0,high=nums.length-1;
         int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<=target){
                if(nums[mid]==target){
                    ans=mid;
                }
                low=mid+1;
            }
            else{
                    high=mid-1;
                }
        }
        return ans;
    }
}
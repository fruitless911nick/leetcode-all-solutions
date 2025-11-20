class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=firstOccurrence(nums,target);
        int last=lastOccurrence(nums,target);
        return new int[]{first,last};
    }

    static int firstOccurrence(int[] nums, int target) {
        int start=0,end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            } else if (nums[mid]<target) {
                start=mid+1;
            }
            else{
                ans=mid; //searching in left part for first occurrence
                end=mid-1;
            }
        }
        return ans;
    }
    static int lastOccurrence(int[] nums, int target) {
        int start=0,end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            } else if (nums[mid]<target) {
                start=mid+1;
            }
            else{
                ans=mid; //searching in right part for last occurrence
                start=mid+1;
            }
        }
        return ans;
    }
    }

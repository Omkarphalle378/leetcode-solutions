class Solution {
    public int rotatedBS(int[]nums,int low,int high,int target){
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[low]<=nums[mid]){
                if(nums[low]<=target && nums[mid]>target){
                    high = mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(nums[high]>=target && nums[mid]<target){
                    low = mid+1;
                }
                else{
                    high = mid -1;
                }
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        return rotatedBS(nums,0,n-1,target);
    }
}
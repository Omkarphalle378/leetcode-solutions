class Solution {
    public int binarySearch(int[]nums,int low,int high){
        while(low<=high){
            int mid = low + (high-low)/2;

            if(mid>0 && nums[mid]==nums[mid-1]){
                if(mid%2 == 0){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }

            else if(mid<nums.length-1 && nums[mid]==nums[mid+1]){
                if((mid+1) % 2 == 0){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                return nums[mid];
            }  
        }
        return -1;
    }
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        return binarySearch(nums,0,n-1);
    }
}
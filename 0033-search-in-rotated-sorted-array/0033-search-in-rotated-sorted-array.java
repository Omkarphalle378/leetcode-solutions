class Solution {
    public int binarySearch(int[]nums,int low,int high,int target,int idx){
        int n = nums.length;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                return (mid+idx)%n;
            }
            else if(nums[mid]<target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
            
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        int mini = nums[0];
        int idx = 0;
        for(int i=1;i<n;i++){
            if(nums[i]<mini){
                mini = nums[i];
                idx = i;
            }
        }
        Arrays.sort(nums);
        return binarySearch(nums,0,n-1,target,idx);
    }
}
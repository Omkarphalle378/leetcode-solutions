class Solution {
    public boolean possible(int[]nums,int mid,int m,int k){
        int count = 0;
        int noOfBouk = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=mid) count++;
            else{
                noOfBouk += count/k;
                count = 0;
            }
        }
        noOfBouk += count/k;
        if(noOfBouk >= m) return true;
        else return false;
    }
    public int binarySearch(int[]nums,int low,int high,int m,int k){
        while(low<=high){
            int mid = low + (high-low)/2;

            if(possible(nums,mid,m,k)==true){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    public int minDays(int[] nums, int m, int k) {
        int n = nums.length;
        if((long)m*k >n) return -1;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mini = Math.min(mini,nums[i]);
            maxi = Math.max(maxi,nums[i]);
        }

        return binarySearch(nums,mini,maxi,m,k);
    }
}
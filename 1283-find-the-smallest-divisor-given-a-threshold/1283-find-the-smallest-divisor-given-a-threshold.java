class Solution {
    public boolean divisor(int[]nums,int threshold,int val){
        long sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += (nums[i]+val-1) / val;
            if(sum > threshold) return false;
        }
        return true;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi = Math.max(maxi,nums[i]);
        }

        int low = 1;
        int high = maxi;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(divisor(nums,threshold,mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}
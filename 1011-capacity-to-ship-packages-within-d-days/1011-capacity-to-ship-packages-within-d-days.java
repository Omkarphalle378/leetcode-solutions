class Solution {
    public boolean findCapacity(int[] nums,int days,int val){
        int sum = 0;
        int count = 1;
        for(int i=0;i<nums.length;i++){
            if(sum + nums[i] > val){
                count ++;
                sum = nums[i];
            }  
            else{
                sum += nums[i];
            }
        }
        return count<=days;
    }
    public int shipWithinDays(int[] nums, int days) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<n;i++){
            maxi = Math.max(maxi,nums[i]);
            sum += nums[i];
        }

        int low = maxi;
        int high = sum;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(findCapacity(nums,days,mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}
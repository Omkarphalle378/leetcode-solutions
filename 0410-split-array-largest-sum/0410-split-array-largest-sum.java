class Solution {
    public int fun(int[]nums,int val){
        int noOfele = 1;
        int sumOfSub = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]+sumOfSub <= val){
                sumOfSub += nums[i];
            }
            else{
                noOfele ++;
                sumOfSub = nums[i];
            }
        }
        return noOfele;
    }
    public int splitArray(int[] nums, int k) {
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
            if(fun(nums,mid)>k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }
}
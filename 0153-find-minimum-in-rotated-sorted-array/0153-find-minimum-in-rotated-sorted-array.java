class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int mini = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]<mini){
                mini = nums[i];
            }
        }
        return mini;
    }
}
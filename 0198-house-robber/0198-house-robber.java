class Solution {
    int[] dp = new int[101];
    public int helper(int[]nums,int i){
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int take = nums[i] + helper(nums,i+2);
        int skip = helper(nums,i+1);

        return dp[i] = Math.max(take,skip);
    }
    public int rob(int[] nums) {
        Arrays.fill(dp,-1);
        return helper(nums,0);
    }
}
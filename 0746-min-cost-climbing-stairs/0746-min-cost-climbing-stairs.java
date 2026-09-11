class Solution {
    int[] dp = new int[1001];
    public int helper(int[]cost,int i){
        if(i>=cost.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int n1 = cost[i] + helper(cost,i+1);
        int n2 = cost[i] + helper(cost,i+2);
        return dp[i] = Math.min(n1,n2); 
    }
    public int minCostClimbingStairs(int[] cost) {
        Arrays.fill(dp,-1);
        int ans = Math.min(helper(cost,0),helper(cost,1));
        return ans;
    }
}
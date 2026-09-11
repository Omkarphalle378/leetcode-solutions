class Solution {
    int[][] dp = new int[101][101];
    int helper(int r,int c,int m,int n){
        if(r>=m || c>=n) return 0;
        if(r==m-1 && c == n-1) return 1;
        if(dp[r][c]!=0) return dp[r][c];
        int bottom = helper(r,c+1,m,n);
        int right = helper(r+1,c,m,n);

        return dp[r][c] = bottom + right;
    }
    public int uniquePaths(int m, int n) {
        int ans = helper(0,0,m,n);
        return ans;
    }
}
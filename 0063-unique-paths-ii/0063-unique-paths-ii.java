class Solution {
    int[][] dp = new int[1000][1000];
    public int helper(int[][] arr,int r,int c){
        if(r>=arr.length || c>=arr[0].length) return 0;
        if(arr[r][c] == 1) return 0;

        if(dp[r][c]!=-1) return dp[r][c];
        if(r==arr.length-1 && c==arr[0].length-1) return 1;
        int right = helper(arr,r,c+1);
        int bottom = helper(arr,r+1,c);

        return dp[r][c] = right + bottom;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return helper(obstacleGrid,0,0);
    }
}
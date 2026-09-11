class Solution {
    int[][] dp = new int[1001][1001];
    public int helper(String s, String t, int l, int r) {
        if (r == t.length())
            return 1;
        if (l >= s.length())
            return 0;

        if (dp[l][r] != -1)
            return dp[l][r];

        int take = 0;
        int skip = 0;
        if (s.charAt(l) == t.charAt(r)) {
            take = helper(s, t, l + 1, r + 1);
        }
        skip = helper(s, t, l + 1, r);
        return dp[l][r] = take + skip;
    }

    public int numDistinct(String s, String t) {
        for(int[]row : dp){
            Arrays.fill(row,-1);
        }
        return helper(s,t,0,0);
    }
}
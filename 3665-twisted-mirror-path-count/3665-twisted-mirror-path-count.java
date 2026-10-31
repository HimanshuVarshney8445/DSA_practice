class Solution {
    long mod = (int) 1e9 + 7;

    public int find(int r, int c, int d, int[][] grid,int[][][] dp) {
        if (r == grid.length - 1 && c == grid[0].length - 1)
            return 1;
        if (r >= grid.length || c >= grid[0].length)
            return 0;
        if(dp[r][c][d]!=-1) return dp[r][c][d];
        if (grid[r][c] == 1) {
            if (d == 0) {
                return dp[r][c][d]=find(r + 1, c, 1, grid,dp);
            } else {
                return dp[r][c][d]=find(r, c + 1, 0, grid,dp);
            }
        }
        return dp[r][c][d]=(int) ((find(r + 1, c, 1, grid,dp) + find(r, c + 1, 0, grid,dp)) % mod);
    }

    public int uniquePaths(int[][] grid) {
        int[][][] dp = new int[grid.length][grid[0].length][2];
        for(int[][] temp:dp){
            for(int[] arr:temp){
                Arrays.fill(arr,-1);
            }
        }
        return find(0, 0, 0, grid, dp);
    }
}
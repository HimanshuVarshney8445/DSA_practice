class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] temp = new int[2];
        int r = 0, c = 0;
        boolean[][] vis = new boolean[n][m];
        vis[r][c] = true;
        while (true) {
            int nr=r,nc=c;
            if (grid[r][c] == 'R') {
                nc++;
            } else if (grid[r][c] == 'L') {
                nc--;
            } else if (grid[r][c] == 'U') {
                nr--;
            } else {
                nr++;
            }
            if (nr < 0 || nr >= n || nc < 0 || nc >= m) break;
            if(vis[nr][nc]) break;
            r=nr;
            c=nc;
            vis[r][c]=true;
        }
        return new int[]{r,c};
    }
}
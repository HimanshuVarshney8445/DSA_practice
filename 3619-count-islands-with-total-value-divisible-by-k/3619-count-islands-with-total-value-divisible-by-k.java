class Solution {
    public long find(int i,int j,boolean[][] vis,int[][] grid){
        int[] row = {-1,0,1,0};
        int[] col = {0,1,0,-1};
        vis[i][j]=true;
        long sum=grid[i][j];
        for(int k=0;k<4;k++){
            int nr = i+row[k];
            int nc = j+col[k];
            if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && !vis[nr][nc] && grid[nr][nc]>0){
                sum+=find(nr,nc,vis,grid);
            }
        }
        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        boolean[][] vis = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && grid[i][j]>0){
                    if(find(i,j,vis,grid)%k==0) count++;
                }
            }
        }
        return count;
    }
}
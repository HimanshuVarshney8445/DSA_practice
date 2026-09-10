class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int n=isWater.length;
        int m=isWater[0].length;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isWater[i][j]==1){
                    q.offer(new int[]{i,j});
                    visited[i][j]=true;
                    isWater[i][j]=0;
                }
            }
        }
        int[] row = {-1,0,1,0};
        int[] col = {0,1,0,-1};
        while(!q.isEmpty()){
            int[] temp = q.poll();
            int r=temp[0];
            int c=temp[1];
            for(int i=0;i<4;i++){
                int nr=r+row[i];
                int nc=c+col[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m && !visited[nr][nc]){
                    visited[nr][nc]=true;
                    isWater[nr][nc]=isWater[r][c]+1;
                    q.offer(new int[]{nr,nc});
                }
            }
        }
        return isWater;

    }
}
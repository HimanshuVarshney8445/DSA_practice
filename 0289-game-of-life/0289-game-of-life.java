class Solution {
    public int count(int[][] board,int i,int j){
        int temp=0;
        int[] row = {-1,0,1,0,-1,-1,1,1};
        int[] col = {0,1,0,-1,-1,1,-1,1};
        for(int a=0;a<8;a++){
            int nr=i+row[a];
            int nc=j+col[a];
            if(nr>=0 && nr<board.length && nc>=0 && nc<board[0].length && board[nr][nc]==1) temp++;
        }
        return temp;
    }
    public void gameOfLife(int[][] board) {
        int[][] arr = new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int num = count(board,i,j);
                if(board[i][j]==1 && num<2){
                    arr[i][j]=0;
                }else if(board[i][j]==1 && (num>=2 && num<=3)){
                    arr[i][j]=1;
                }else if(board[i][j]==1 && num>3){
                    arr[i][j]=0;
                }else if(board[i][j]==0 && num==3){
                    arr[i][j]=1;
                }
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(arr[i][j]==1){
                    board[i][j]=1;
                }else board[i][j]=0;
            }
        }
    }
}
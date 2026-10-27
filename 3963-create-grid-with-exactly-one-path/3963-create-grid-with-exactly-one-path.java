class Solution {
    public String[] createGrid(int m, int n) {
        char[][] arr = new char[m][n];
        for(char[] ch:arr) Arrays.fill(ch,'#');
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i == 0 || j == n-1){
                    arr[i][j]='.';
                }
            }
        }
        String[] temp = new String[m];
        for(int i=0;i<m;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(arr[i][j]);
            }
            temp[i]=sb.toString();
        }
        return temp;
    }
}
class Solution {
    public void reverse(int start,int end,int[] arr){
        while(start<end){
            int temp = arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int[] arr = new int[grid.length*grid[0].length];
        int size = arr.length;
        int a=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                arr[a++]=grid[i][j];
            }
        }
        k%=size;
        reverse(0,size-1,arr);
        reverse(0,k-1,arr);
        reverse(k,size-1,arr);
        a=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                grid[i][j]=arr[a++];
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<grid[0].length;j++){
                temp.add(grid[i][j]);
            }
            list.add(temp);
        }
        return list;
    }
}
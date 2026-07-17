class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] inOrder = new int[n];
        for(int[] temp:edges){
            inOrder[temp[1]]++;
        }
        int count=0,index=-1;
        for(int i=0;i<n;i++){
            if(inOrder[i]==0){
                count++;
                if(index==-1) index=i;
            }
        }
        return count>1 ? -1 : index;
    }
}
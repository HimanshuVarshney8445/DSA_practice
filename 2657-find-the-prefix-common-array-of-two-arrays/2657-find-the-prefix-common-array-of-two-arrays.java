class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length,count=0;
        int[] arr = new int[n];
        boolean[] temp = new boolean[n];
        for(int i=0;i<n;i++){
            if(temp[A[i]-1]) count++;
            else temp[A[i]-1]=true;
            if(temp[B[i]-1]) count++;
            else temp[B[i]-1]=true;
            arr[i]=count;
        }
        return arr;
    }
}
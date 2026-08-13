class Solution {
    public int findLucky(int[] arr) {
        int[] temp = new int[501];
        for(int i=0;i<arr.length;i++){
            temp[arr[i]]++;
        }
        int min=-1;
        for(int i=1;i<temp.length;i++){
            if(temp[i]==i){
                min=Math.max(min,i);
            }
        }
        return min;
    }
}
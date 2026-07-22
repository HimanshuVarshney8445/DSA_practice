class Solution {
    public int getWinner(int[] arr, int k) {
        if(k>=arr.length){
            int max=0;
            for(int i:arr) max=Math.max(max,i);
            return max;
        }
        int winner = arr[0];
        int win = 0;
        for(int i=1;i<arr.length;i++){
            if(winner>arr[i]){
                win++;
            }else{
                winner=arr[i];
                win=1;
            }
            if(win==k) return winner;
        }
        return winner;
    }
}
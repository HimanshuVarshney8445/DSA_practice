class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int count=0;
        int[] need = new int[rocks.length];
        for(int i=0;i<rocks.length;i++){
            need[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(need);
        for(int i=0;i<rocks.length;i++){
            if(need[i]<=additionalRocks){
                count++;
                additionalRocks-=need[i];
            }else break;
        }
        return count;
    }
}
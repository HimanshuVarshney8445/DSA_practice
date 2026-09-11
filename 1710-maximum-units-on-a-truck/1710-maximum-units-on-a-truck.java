class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)-> b[1]-a[1]);
        int count=0;
        for(int[] temp:boxTypes){
            int boxes = Math.min(temp[0],truckSize);
            count+=(boxes*temp[1]);
            truckSize-=boxes;
            if(truckSize==0) break;
        }
        return count;
    }
}
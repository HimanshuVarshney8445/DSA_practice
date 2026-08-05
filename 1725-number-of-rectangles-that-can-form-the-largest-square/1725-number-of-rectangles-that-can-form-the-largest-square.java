class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int max=0;
        int[] temp = new int[rectangles.length];
        for(int i=0;i<rectangles.length;i++){
            int a=rectangles[i][0];
            int b=rectangles[i][1];
            int min = Math.min(a,b);
            temp[i]=min;
            max=Math.max(max,min);
        }
        int count=0;
        for(int i=0;i<temp.length;i++){
            if(temp[i]==max) count++;
        }
        return count;
    }
}
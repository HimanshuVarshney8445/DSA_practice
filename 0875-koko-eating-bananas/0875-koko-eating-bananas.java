class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=1;
        int end=Arrays.stream(piles).max().getAsInt();
        while(start<=end){
            int mid=start+(end-start)/2;
            long hour=0;
            for(int hr:piles) hour+=(hr+mid-1)/mid;
            if(hour<=h) end=mid-1;
            else start=mid+1;
        }
        return start;
    }
}
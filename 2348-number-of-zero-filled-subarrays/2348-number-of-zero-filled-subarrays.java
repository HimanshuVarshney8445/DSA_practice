class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0,repeat=0;
        for(int i:nums){
            repeat = (i==0) ? repeat+1:0;
            count+=repeat;
        }
        return count;
    }
}
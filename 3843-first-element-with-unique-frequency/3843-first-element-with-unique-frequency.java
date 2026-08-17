class Solution {
    public int firstUniqueFreq(int[] nums) {
        int[] freq = new int[100001];
        int[] freqCount = new int[100001];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                freqCount[freq[i]]++;
            }
        }
        for(int num:nums){
            if(freqCount[freq[num]]==1) return num;
        }
        return -1;
    }
}
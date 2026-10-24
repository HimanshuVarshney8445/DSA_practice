class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minK || nums[i]>maxK) j=i+1;
            count+=(i-j+1);
        }
        return count;
    }
}

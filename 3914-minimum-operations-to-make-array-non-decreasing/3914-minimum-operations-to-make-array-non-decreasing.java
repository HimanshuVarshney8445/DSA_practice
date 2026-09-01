class Solution {
    public long minOperations(int[] nums) {
        long count=0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>nums[i+1]){
                count+=nums[i]-nums[i+1];
            }
        }
        return count;
    }
}
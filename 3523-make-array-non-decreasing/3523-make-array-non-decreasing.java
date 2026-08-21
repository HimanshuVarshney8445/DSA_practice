class Solution {
    public int maximumPossibleSize(int[] nums) {
        int count=1,prev=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>=prev){
                count++;
                prev=nums[i];
            }
        }
        return count;
    }
}
class Solution {
    public int absDifference(int[] nums, int k) {
        int left=0,right=0;
        Arrays.sort(nums);
        for(int i=0;i<k;i++) left+=nums[i];
        for(int i=nums.length-1;i>=nums.length-k;i--) right+=nums[i];
        return Math.abs(right-left);
    }
}
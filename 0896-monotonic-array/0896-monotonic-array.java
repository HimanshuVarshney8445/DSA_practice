class Solution {
    public boolean inc(int[] nums){
        boolean flag=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]) return false;
        }
        return true;
    }
    public boolean desc(int[] nums){
        boolean flag=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]) return false;
        }
        return true;
    }
    public boolean isMonotonic(int[] nums) {
        return (inc(nums) || desc(nums));
    }
}
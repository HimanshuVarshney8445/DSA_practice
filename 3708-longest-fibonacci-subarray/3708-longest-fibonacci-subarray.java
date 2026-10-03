class Solution {
    public int longestSubarray(int[] nums) {
        int max=2,j=0;
        for(int i=2;i<nums.length;i++){
            if(nums[i-2]+nums[i-1] == nums[i]){
                max=Math.max(max,i-j+1);
            }else j=i-1;
        }
        return max;
    }
}


// 



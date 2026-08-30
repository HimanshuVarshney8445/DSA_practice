class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1,inc=1,dsc=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                inc++;
                dsc=1;
            }else if(nums[i]<nums[i-1]){
                dsc++;
                inc=1;
            }else{
                dsc=1;
                inc=1;
            }
            max=Math.max(max,Math.max(inc,dsc));
        }
        return max;
    }
}
class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int max=Integer.MIN_VALUE;
        int[] temp = {-1,-1};
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    if((nums[i]+nums[j]) == target && ((nums[i]*nums[j]) > max)){
                        max=Math.max(max,nums[i]*nums[j]);
                        temp[0]=i;
                        temp[1]=j;
                    }
                }
            }
        }
        return temp;
    }
}
class Solution {
    public int minimumDeletions(int[] nums) {
        int max=nums[0],min=nums[0];
        int k=0,j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                j=i;
            }
            if(nums[i]>max){
                max=nums[i];
                k=i;
            }
        }
        int first = Math.max(k,j);
        int second = Math.min(k,j);
        int third = (second+1) + (nums.length-first);
        return Math.min(first+1,Math.min(nums.length-second,third));
    }
}
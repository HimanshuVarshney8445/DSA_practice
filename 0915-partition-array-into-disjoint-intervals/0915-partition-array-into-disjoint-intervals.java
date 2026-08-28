class Solution {
    public int partitionDisjoint(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            left[i]=max;
        }
        for(int i=nums.length-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            right[i]=min;
        }
        for(int i=0;i<nums.length-1;i++){
            if(left[i]<=right[i+1]) return i+1;
        }
        return -1;
    }
}
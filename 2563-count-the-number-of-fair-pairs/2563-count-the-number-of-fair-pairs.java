class Solution {
    public long upperB(int start,int end,int target,int[] nums){
        while(start<end){
            int mid = start+(end-start)/2;
            if(nums[mid]>target){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    public long lowerB(int start,int end,int target,int[] nums){
        while(start<end){
            int mid = start+(end-start)/2;
            if(nums[mid]>=target){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    public long countFairPairs(int[] nums, int lower, int upper) {
        long count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            long l = lowerB(i+1,nums.length,lower-nums[i],nums);
            long u = upperB(i+1,nums.length,upper-nums[i],nums);
            count+=(u-l);
        }
        return count;
    }
}
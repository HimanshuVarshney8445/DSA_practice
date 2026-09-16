class Solution {
    public boolean search(int start,int end,int target,int[] nums){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }
    public int findPairs(int[] nums, int k) {
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            if(search(i+1,nums.length-1,nums[i]+k,nums)) count++;
        }
        return count;
    }
}
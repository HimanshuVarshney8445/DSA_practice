class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=0;
        for(int i:nums) max=Math.max(max,i);
        int j=0,count=0;
        long ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max) count++;
            while(count>=k){
                if(nums[j]==max) count--;
                j++;
            }
            ans+=j;
        }
        return ans;
    }
}
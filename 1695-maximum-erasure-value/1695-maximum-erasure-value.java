class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int j=0,sum=0,max=0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            while(set.contains(nums[i])){
                set.remove(nums[j]);
                sum-=nums[j];
                j++;
            }
            set.add(nums[i]);
            sum+=nums[i];
            max=Math.max(max,sum);
        }
        return max;
    }
}
class Solution {
    public int maximumBeauty(int[] nums, int k) {
        int j=0,max=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            while(nums[i]-nums[j] > 2*k) j++;
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}
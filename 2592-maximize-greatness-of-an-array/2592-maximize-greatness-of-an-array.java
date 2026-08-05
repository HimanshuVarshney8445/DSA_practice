class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[j]){
                j++;
                count++;
            }
        }
        return count;
    }
}

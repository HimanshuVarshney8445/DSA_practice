class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i=1;i<nums.length;i++){
            int num = nums[i-1];
            if(num%2==nums[i]%2) return false;
        }
        return true;
    }
}
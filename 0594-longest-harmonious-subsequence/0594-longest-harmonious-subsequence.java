class Solution {
    public int findLHS(int[] nums) {
        int j=0,count=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            while((nums[i]-nums[j])>1){
                j++;
            }
            if(nums[i]-nums[j]==1){
                count=Math.max(count,i-j+1);
            }
        }
        return count;
    }
}
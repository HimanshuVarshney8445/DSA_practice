class Solution {
    public int countDominantElements(int[] nums) {
        int count=0;
        if(nums.length<2) return 1;
        for(int i=0;i<nums.length;i++){
            int sum=0,cnt=0;
            if(i>0){
                sum+=nums[i-1];
                cnt++;
            }
            if(i<nums.length-1){
                sum+=nums[i+1];
                cnt++;
            }
            if(nums[i]>=(double)sum/cnt) count++;
        }
        return count;
    }
}
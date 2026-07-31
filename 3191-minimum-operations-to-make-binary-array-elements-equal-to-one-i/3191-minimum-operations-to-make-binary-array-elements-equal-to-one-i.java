class Solution {
    public int minOperations(int[] nums) {
        int i=2,j=0,count=0;
        while(i<nums.length){
            if(nums[j]==0){
                count++;
                for(int k=j;k<j+3;k++){
                    nums[k]=(nums[k]==0) ? 1:0;
                }
            }
            i++;
            j++;
        }
        for(int a=0;a<nums.length;a++){
            if(nums[a]==0) return -1;
        }
        return count;
    }
}
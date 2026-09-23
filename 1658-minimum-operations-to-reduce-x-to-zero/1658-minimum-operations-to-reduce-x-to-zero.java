class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0;
        for(int i:nums) sum+=i;
        int temp=0,j=0,maxLen=-1;
        for(int i=0;i<nums.length;i++){
            temp+=nums[i];
            while(j<=i && temp>(sum-x)){
                temp-=nums[j];
                j++;
            }
            if(temp==(sum-x)){
                maxLen = Math.max(maxLen, i - j + 1);
            }
        }
        if(maxLen==-1) return -1;
        return nums.length-maxLen;
    }
}
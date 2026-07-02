class Solution {
    public int find(int n,int digit){
        int count=0;
        while(n>0){
            int num = n%10;
            if(num==digit) count++;
            n/=10;
        }
        return count;
    }
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int temp = find(nums[i],digit);
            count+=temp;
        }
        return count;
    }
}
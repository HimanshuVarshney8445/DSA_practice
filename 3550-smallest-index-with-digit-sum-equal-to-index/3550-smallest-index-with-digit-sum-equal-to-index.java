class Solution {
    public int find(int n){
        int sum=0;
        while(n!=0){
            int r=n%10;
            sum+=r;
            n/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(find(nums[i])==i) return i;
        }
        return -1;
    }
}
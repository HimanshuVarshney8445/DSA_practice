class Solution {
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public long maxPairStrength(int[] nums) {
        long max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int num = gcd(nums[i],nums[j]);
                long strength = (1L * nums[i] * nums[j]) / (1L * num * num);
                max=Math.max(max,strength);
            }
        }
        return max;
    }
}
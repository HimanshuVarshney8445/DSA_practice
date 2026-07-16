class Solution {
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        int[] preMax = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            preMax[i]=max;
        }
        int[] prefixGcd = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int num = gcd(preMax[i],nums[i]);
            prefixGcd[i]=num;
        }
        Arrays.sort(prefixGcd);
        int i=0,j=nums.length-1;
        long sum=0;
        while(i<j){
            int num = gcd(prefixGcd[i++],prefixGcd[j--]);
            sum+=num;
        }
        return sum;
    }
}
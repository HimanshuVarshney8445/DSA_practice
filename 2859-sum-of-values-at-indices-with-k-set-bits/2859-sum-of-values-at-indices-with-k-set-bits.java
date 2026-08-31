class Solution {
    public boolean find(int i,int k){
        int count=0;
        while(i!=0){
            int r = i%2;
            if(r==1) count++;
            i/=2;
        }
        return count==k;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            if(find(i,k)){
                sum+=nums.get(i);
            }
        }
        return sum;
    }
}
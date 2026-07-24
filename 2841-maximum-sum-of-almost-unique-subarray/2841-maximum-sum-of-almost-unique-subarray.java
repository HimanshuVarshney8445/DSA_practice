class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        long sum=0,max=0;
        int j=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.size();i++){
            int num = nums.get(i);
            map.put(num,map.getOrDefault(num,0)+1);
            sum+=num;
            while(i-j+1 > k){
                int temp = nums.get(j);
                map.put(temp,map.get(temp)-1);
                if(map.get(temp)==0) map.remove(temp);
                sum-=temp;
                j++;
            }
            if(map.size()>=m) max=Math.max(max,sum);
        }
        return max;
    }
}
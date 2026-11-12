class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        int n=nums.length;
        if(n%k!=0) return false;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(map.get(nums[i])==0) continue;
            for(int j=0;j<k;j++){
                int cur = nums[i]+j;
                if(map.getOrDefault(cur,0)==0) return false;
                map.put(cur,map.get(cur)-1);
            }
        }
        return true;
    }
}
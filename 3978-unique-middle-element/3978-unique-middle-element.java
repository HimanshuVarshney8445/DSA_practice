class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        int mid = nums[nums.length / 2];
        return freq.get(mid)==1;
    }
}
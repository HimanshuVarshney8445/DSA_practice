class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int count=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=nums.size()-1;i>=0;i--){
            count++;
            if(nums.get(i)<=k) set.add(nums.get(i));
            if(set.size()==k) return count;
        }
        return count;
    }
}
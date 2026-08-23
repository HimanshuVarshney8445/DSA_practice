class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        int left=lower;
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int n:nums){
            if(n<lower || n>upper) continue;
            if(left<n){
                list.add(Arrays.asList(left,n-1));
            }
            left=n+1;
        }
        if(left<=upper){
            list.add(Arrays.asList(left,upper));
        }
        return list;
    }
}
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        Collections.reverse(list);
        int size = Math.min(set.size(),k);
        int[] temp = new int[size];
        for(int i=0;i<size;i++){
            temp[i]=list.get(i);
        }
        return temp;
    }
}
class Solution {
    public int[] arrayRankTransform(int[] nums) {
        int rank=1;
        int[] arr = nums.clone();
        Arrays.sort(arr);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],rank++);
            }
        }
        int[] temp = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=map.get(nums[i]);
        }
        return temp;
    }
}
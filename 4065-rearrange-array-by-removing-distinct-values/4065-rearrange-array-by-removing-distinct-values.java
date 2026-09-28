class Solution {
    public int[] rearrangeArray(int[] nums) {
        int count=nums.length;
        int[] arr = new int[101];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++) arr[nums[i]]++;
        while(count>0){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>0){
                    list.add(i);
                    arr[i]--;
                    count--;
                }
            }
        }
        int[] temp = new int[list.size()];
        for(int i=0;i<list.size();i++){
            temp[i]=list.get(i);
        }
        return temp;
    }
}
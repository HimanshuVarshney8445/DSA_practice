class Solution {
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public int[] rotateElements(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                list.add(nums[i]);
            }
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        if (arr.length == 0) return nums;
        k=k%arr.length;
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                nums[i]=arr[j++];
            }
        }
        return nums;
    }
}

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=1;
        HashSet<Integer> set = new HashSet<>();
        for(int j:arr) set.add(j);
        while(k!=0){
            if(!set.contains(i)) k--;
            i++;
        }
        return i-1;
    }
}

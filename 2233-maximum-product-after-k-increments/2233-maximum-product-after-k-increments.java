class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x:nums) pq.offer(x);
        while(k-->0){
            int num = pq.poll()+1;
            pq.offer(num);
        }
        long ans=1;
        for(int i=0;i<nums.length;i++){
            ans = (ans*pq.poll())%1000000007;
        }
        return (int)ans;
    }
}
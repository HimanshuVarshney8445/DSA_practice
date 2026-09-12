class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i:nums){
            pq.offer((long)i);
        }
        int count=0;
        while(pq.size() >= 2 && pq.peek()<k){
            count++;
            long n1 = pq.poll();
            long n2 = pq.poll();
            long temp = Math.min(n1,n2)*2+Math.max(n1,n2);
            pq.offer(temp);
        }
        return count;
    }
}
// 1,000,000,000
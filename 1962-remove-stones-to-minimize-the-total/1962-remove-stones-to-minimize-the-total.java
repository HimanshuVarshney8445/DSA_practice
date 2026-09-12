class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        int sum=0;
        for(int i:piles){
            pq.offer(i);
            sum+=i;
        }
        int pqSum=sum;
        while(k-->0){
            int n=pq.poll();
            pqSum-=n;
            int num = (n+1)/2;
            pqSum+=num;
            pq.offer(num);
        }
        return pqSum;
    }
}
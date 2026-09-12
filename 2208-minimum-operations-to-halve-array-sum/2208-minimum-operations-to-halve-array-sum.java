class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>((a,b)->Double.compare(b,a));
        double sum=0;
        for(int i:nums){
            pq.offer((double)i);
            sum+=i;
        }
        int count=0;
        double pqSum=sum;
        while(pqSum>(sum/2)){
            count++;
            double n1 = pq.poll();
            pqSum-=n1;
            pq.offer(n1/2);
            pqSum+=(n1/2);
        }
        return count;
    }
}
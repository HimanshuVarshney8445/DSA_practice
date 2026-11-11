class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long m1 = (long)cost1*need1 + (long)cost2*need2;
        long m2 = (long)costBoth*Math.max(need1,need2);
        long min = Math.min(need1,need2);
        long m3 = min*costBoth + (need1-min)*cost1 + (need2-min)*cost2;
        return Math.min(m1,Math.min(m2,m3));
    }
}

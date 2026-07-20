class Solution {
    public boolean canReach(int[] start, int[] target) {
        int t1 = start[0]+start[1];
        int t2 = target[0]+target[1];
        if((t1%2==0 && t2%2==0) || (t1%2!=0 && t2%2!=0)) return true;
        return false;
    }
}
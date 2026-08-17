class Solution {
    public int elevatorRequests(int n, int[] req) {
        int sum=req[0],left=req[0];
        for(int i=1;i<req.length;i++){
            sum+=Math.abs(left-req[i]);
            left=req[i];
        }
        return sum;
    }
}
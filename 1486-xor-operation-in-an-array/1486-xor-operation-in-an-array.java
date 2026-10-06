class Solution {
    public int xorOperation(int n, int start) {
        int xor=0;
        for(int i=0;i<n;i++){
            int temp=(start+(2*i));
            xor^=temp;
        }
        return xor;
    }
}
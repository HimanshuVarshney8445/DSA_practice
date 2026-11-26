class Solution {
    public boolean canAliceWin(int n) {
        int i=10,j=0;
        while(n>0){
            if(n<i) return j%2==1;
            n-=i;
            i--;
            j++;
        }
        return j%2==1;
    }
}
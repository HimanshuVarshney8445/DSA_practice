class Solution {
    public boolean check(int n,int t){
        int a=1;
        while(n!=0){
            int r = n%10;
            a*=r;
            n/=10;
        }
        return a%t==0;
    }
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=n+10;i++){
            if(check(i,t)){
                return i;
            }
        }
        return -1;
    }
}
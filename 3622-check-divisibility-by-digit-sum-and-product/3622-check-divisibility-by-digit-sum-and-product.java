class Solution {
    public int sum(int n){
        int s=0;
        while(n!=0){
            int r = n%10;
            s+=r;
            n/=10;
        }
        return s;
    }
    public int pro(int n){
        int p=1;
        while(n!=0){
            int r = n%10;
            p*=r;
            n/=10;
        }
        return p;
    }
    public boolean checkDivisibility(int n) {
        int n1 = sum(n);
        int n2 = pro(n);
        return n%(n1+n2)==0;
    }
}
class Solution {
    public int reverse(int n){
        int temp=0;
        while(n!=0){
            int r = n%10;
            temp = temp*10 + r;
            n/=10;
        }
        return temp;
    }
    public int sumOfPrimesInRange(int n) {
        int m = reverse(n);
        int left = Math.min(n,m);
        int right = Math.max(n,m);
        boolean[] isPrime = new boolean[right+1];
        for(int i=2;i<=right;i++) isPrime[i]=true;
        for(int i=2;i*i<=right;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=right;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        int sum=0;
        for(int i=left;i<=right;i++){
            if(isPrime[i]) sum+=i;
        }
        return sum;
    }
}
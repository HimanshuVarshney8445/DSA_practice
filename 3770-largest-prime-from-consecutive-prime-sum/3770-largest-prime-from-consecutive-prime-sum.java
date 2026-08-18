class Solution {
    public int largestPrime(int n) {
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i*i<=n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
        int sum=0,ans=0;
        for(int i=2;i<=n;i++){
            if(prime[i]){
                sum+=i;
                if(sum>n) break;
                if(prime[sum]){
                    ans=sum;
                }
            }
        }
        return ans;
    }
}
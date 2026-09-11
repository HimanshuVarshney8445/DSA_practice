class Solution {
    public List<Integer> getPrime(int num){
        List<Integer> factors = new ArrayList<>();
        for(int p=2;p*p<=num;p++){
            if(num%p==0){
                factors.add(p);
                while(num%p==0){
                    num /= p;
                }
            }
        }
        if(num>1) factors.add(num);
        return factors;
    }
    public int longestSubarray(int[] nums, int k) {
        int j=0,ans=0,diff=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int a:getPrime(nums[i])){
                if(!map.containsKey(a)){
                    diff++;
                }
                map.put(a,map.getOrDefault(a,0)+1);
            }
            while(diff>k){
                for(int a:getPrime(nums[j])){
                    map.put(a,map.get(a)-1);
                    if(map.get(a)==0){
                        map.remove(a);
                        diff--;
                    }
                }
                j++;
            }
            ans=Math.max(ans,i-j+1);
        }
        return ans;
    }
}
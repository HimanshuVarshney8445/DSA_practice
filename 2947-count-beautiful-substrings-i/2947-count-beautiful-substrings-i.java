class Solution {
    public int beautifulSubstrings(String s, int k) {
        int n=s.length();
        int[] vow = new int[n];
        int[] cons = new int[n];
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vow[i] = (i > 0 ? vow[i - 1] : 0) + 1;
                cons[i] = (i > 0 ? cons[i - 1] : 0);
            } else {
                cons[i] = (i > 0 ? cons[i - 1] : 0) + 1;
                vow[i] = (i > 0 ? vow[i - 1] : 0);
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int v = vow[j]-(i>0 ? vow[i-1]:0);
                int c = cons[j]-(i>0 ? cons[i-1]:0);
                if(c==v && (c*v)%k==0) count++;
            }
        }
        return count;
    }
}
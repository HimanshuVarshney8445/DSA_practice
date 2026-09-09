class Solution {
    public int minimumRecolors(String blocks, int k) {
        int j=0,white=0,ans=Integer.MAX_VALUE;
        for(int i=0;i<blocks.length();i++){
            char ch = blocks.charAt(i);
            if(ch=='W') white++;
            while(i-j+1>k){
                if(blocks.charAt(j)=='W') white--;
                j++;
            }
            if(i-j+1==k) ans=Math.min(ans,white);
        }
        return ans;
    }
}
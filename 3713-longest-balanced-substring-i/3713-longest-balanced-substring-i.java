class Solution {
    public int longestBalanced(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int[] temp = new int[26];
            for(int j=i;j<s.length();j++){
                int ch = s.charAt(j)-'a';
                temp[ch]++;
                int freq = 0;
                boolean balanced = true;
                for(int k=0;k<26;k++){
                    if(temp[k]>0){
                        freq=temp[k];
                        break;
                    }
                }
                for(int k=0;k<26;k++){
                    if(temp[k]>0 && temp[k]!=freq){
                        balanced=false;
                        break;
                    }
                }
                if(balanced){
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
}
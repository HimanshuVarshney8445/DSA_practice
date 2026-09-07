class Solution {
    public int minimumLength(String s) {
        if(s.length()<3) return s.length();
        int[] pre = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            pre[ch-'a']++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(pre[i]==0) continue;
            else if(pre[i]%2==0) count+=2;
            else count+=1;
        }
        return count;
    }
}
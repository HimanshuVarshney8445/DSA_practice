class Solution {
    public int maxDifference(String s) {
        int[] temp = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            temp[ch-'a']++;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<26;i++){
            if(temp[i]==0) continue;
            for(int j=i+1;j<26;j++){
                if(temp[j]==0) continue;
                if(temp[i]%2!=0 && temp[j]%2==0){
                    max=Math.max(max,temp[i]-temp[j]);
                }
                if(temp[i]%2==0 && temp[j]%2!=0){
                    max = Math.max(max, temp[j] - temp[i]);
                }
            }
        }
        return max;
    }
}
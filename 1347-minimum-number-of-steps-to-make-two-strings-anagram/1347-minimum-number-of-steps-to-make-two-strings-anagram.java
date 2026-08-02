class Solution {
    public int minSteps(String s, String t) {
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        for(int i=0;i<s.length();i++){
            c1[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            c2[t.charAt(i)-'a']++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            count+=(Math.abs(c1[i]-c2[i]));
        }
        return count/2;
    }
}
class Solution {
    public int residuePrefixes(String s) {
        int ans = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
            int len = i + 1;
            if (set.size()==len % 3) {
                ans++;
            }
        }
        return ans;
    }
}
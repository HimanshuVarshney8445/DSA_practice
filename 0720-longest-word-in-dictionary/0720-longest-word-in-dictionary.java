class Solution {
    public String longestWord(String[] words) {
        Set<String> set = new HashSet<>();
        for(String i:words) set.add(i);
        String ans = "";
        for(int i=0;i<words.length;i++){
            String str = words[i];
            boolean valid = true;
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<str.length();j++){
                sb.append(str.charAt(j));
                if(!set.contains(sb.toString())){
                    valid=false;
                    break;
                }
            }
            if (valid) {
                if (str.length() > ans.length() ||
                   (str.length() == ans.length() && str.compareTo(ans) < 0)) {
                    ans = str;
                }
            }
        }
        return ans;
    }
}
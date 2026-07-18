class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }
        int i=0;
        StringBuilder ans = new StringBuilder();
        while(i<s.length()){
            char ch = s.charAt(i);
            if(ch=='('){
                i++;
                StringBuilder sb = new StringBuilder();
                while(i<s.length() && s.charAt(i)!=')'){
                    sb.append(s.charAt(i));
                    i++;
                }
                ans.append(map.getOrDefault(sb.toString(),"?"));
                i++;
            }else{
                ans.append(ch);
                i++;
            }
        }
        return ans.toString();
    }
}
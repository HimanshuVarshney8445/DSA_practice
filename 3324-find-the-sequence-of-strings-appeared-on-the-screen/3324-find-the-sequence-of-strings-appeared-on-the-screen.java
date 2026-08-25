class Solution {
    public List<String> stringSequence(String target) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<target.length();i++){
            char t = target.charAt(i);
            for(int ch='a';ch<=t;ch++){
                if(sb.length()>i){
                    sb.setCharAt(i,(char)ch);
                }else sb.append((char)ch);
                list.add(sb.toString());
            }
        }
        return list;
    }
}
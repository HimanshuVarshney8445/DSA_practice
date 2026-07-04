class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                list.add(ch);
            }
        }
        Collections.sort(list);
        int j=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                sb.append(list.get(j++));
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
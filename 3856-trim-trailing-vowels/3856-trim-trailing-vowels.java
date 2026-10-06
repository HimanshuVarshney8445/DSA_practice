class Solution {
    public String trimTrailingVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()) st.push(ch);
        while(!st.isEmpty() && list.contains(st.peek())){
            st.pop();
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
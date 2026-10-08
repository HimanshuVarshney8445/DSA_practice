class Solution {
    public String largestEven(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            st.push(ch);
        }
        boolean flag=true;
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty() && st.peek()=='1') st.pop();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
class Solution {
    public List<String> cellsInRange(String s) {
        int n1=s.charAt(1)-'0';
        int n2=s.charAt(4)-'0';
        char c1=s.charAt(0);
        char c2=s.charAt(3);
        List<String> list = new ArrayList<>();
        for (char c = c1; c <= c2; c++) {
            for (int i = n1; i <= n2; i++) {
                list.add("" + c + i);
            }
        }
        return list;
    }
}
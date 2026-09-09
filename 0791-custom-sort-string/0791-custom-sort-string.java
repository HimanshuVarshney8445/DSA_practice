class Solution {
    public String customSortString(String order, String s) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<order.length();i++){
            while(list.contains(order.charAt(i))){
                sb.append(order.charAt(i));
                list.remove(Character.valueOf(order.charAt(i)));
            }
        }
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i));
        }
        return sb.toString();
    }
}
class Solution {
    public void find(String[] products,String sb,List<List<String>> list){
        List<String> lst = new ArrayList<>();
        for(int i=0;i<products.length;i++){
            String s = products[i];
            if(s.startsWith(sb)) lst.add(s);
            if(lst.size()==3) break;
        }
        list.add(lst);
    }
    public List<List<String>> suggestedProducts(String[] products, String str) {
        Arrays.sort(products);
        List<List<String>> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            find(products,sb.toString(),list);
        }
        return list;
    }
}
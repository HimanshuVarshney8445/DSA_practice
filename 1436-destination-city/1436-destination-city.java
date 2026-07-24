class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,String> map = new HashMap<>();
        for(int i=0;i<paths.size();i++){
            String n1 = paths.get(i).get(0);
            String n2 = paths.get(i).get(1);
            map.put(n1,n2);
        }
        String t2=paths.get(0).get(1);
        while (map.containsKey(t2)) {
            t2 = map.get(t2);
        }
        return t2;
    }
}
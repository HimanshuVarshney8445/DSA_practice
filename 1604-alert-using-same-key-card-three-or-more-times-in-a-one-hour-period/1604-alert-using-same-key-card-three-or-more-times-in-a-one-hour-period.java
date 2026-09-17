class Solution {
    public int convert(String s){
        int hr = Integer.parseInt(s.substring(0,2));
        int min = Integer.parseInt(s.substring(3,5));
        return hr*60 + min;
    }
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<keyName.length;i++){
            String name = keyName[i];
            String time = keyTime[i];
            map.putIfAbsent(name, new ArrayList<>());
            map.get(name).add(time);
        }
        List<String> arr = new ArrayList<>();
        for(Map.Entry<String,List<String>> temp : map.entrySet()){
            String name = temp.getKey();
            List<String> list = temp.getValue();
            Collections.sort(list);
            for(int i=0;i+2<list.size();i++){
                int t1 = convert(list.get(i));
                int t3 = convert(list.get(i+2));
                if(t3-t1 <= 60){
                    arr.add(name);
                    break;
                }
            }
        }
        Collections.sort(arr);
        return arr;
    }
}
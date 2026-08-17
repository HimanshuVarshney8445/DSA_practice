class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> list = new ArrayList<>();
        boolean[] ch = new boolean[101];
        for(int i=0;i<bulbs.size();i++){
            ch[bulbs.get(i)]=ch[bulbs.get(i)] ? false:true;
        }
        for(int i=1;i<101;i++){
            if(ch[i]) list.add(i);
        }
        return list;
    }
}
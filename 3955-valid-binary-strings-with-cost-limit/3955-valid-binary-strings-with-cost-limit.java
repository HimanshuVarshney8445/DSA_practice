class Solution {
    public void find(int idx,int n,int k,int cost,boolean flag,StringBuilder str,List<String> list){
        if(cost>k) return;
        if(idx==n){
            list.add(str.toString());
            return;
        }
        str.append('0');
        find(idx+1,n,k,cost,false,str,list);
        str.deleteCharAt(str.length()-1);
        if(!flag){
            str.append('1');
            find(idx+1,n,k,cost+idx,true,str,list);
            str.deleteCharAt(str.length()-1);
        }
    }
    public List<String> generateValidStrings(int n, int k) {
        List<String> list = new ArrayList<>();
        find(0,n,k,0,false,new StringBuilder(),list);
        return list;
    }
}
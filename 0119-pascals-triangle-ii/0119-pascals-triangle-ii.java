class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<rowIndex+5;i++){
            List<Integer> lst = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) lst.add(1);
                else{
                    int num = list.get(i-1).get(j-1)+list.get(i-1).get(j);
                    lst.add(num);
                }
            }
            list.add(lst);
            if(i==rowIndex) break;
            
        }
        return list.get(rowIndex);
    }
}
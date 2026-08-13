class Solution {
    public int findMinFibonacciNumbers(int k) {
        if (k == 1) {
            return 1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        int j=2;
        while(true){
            int temp = list.get(j-1)+list.get(j-2);
            if(temp>k) break;
            list.add(temp);
            j++;
        }
        int count=0;
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)<=k){
                k-=list.get(i);
                count++;
            }
        }
        return count;
    }
}
// 1 1
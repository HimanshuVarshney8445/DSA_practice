class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long num=0;
        ArrayList<Integer> list = new ArrayList();
        while(n>0){
            int a = n%10;
            if(a!=0){
                list.add(a);
                sum+=a;
            }
            n/=10;
        }
        Collections.reverse(list);
        for(int i=0;i<list.size();i++){
            num = num*10 + list.get(i);
        }
        return num*sum;
    }
}
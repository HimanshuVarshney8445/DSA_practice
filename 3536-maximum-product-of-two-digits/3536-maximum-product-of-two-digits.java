class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while(n!=0){
            int num = n%10;
            list.add(num);
            n/=10;
        }
        Collections.sort(list);
        Collections.reverse(list);
        return list.get(0)*list.get(1);
    }
}
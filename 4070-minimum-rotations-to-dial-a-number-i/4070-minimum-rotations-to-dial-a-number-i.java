class Solution {
    public int minRotations(String s) {
        int count=0;
        int n=0;
        for(int i=0;i<s.length();i++){
            int n1 = Math.abs((s.charAt(i)-'0') - n);
            n=s.charAt(i)-'0';
            int min = Math.min(n1,10-n1);
            count+=min;
            System.out.print(count+" ");
        }
        return count;
    }
}

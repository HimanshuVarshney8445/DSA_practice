class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        while(sb.length()!=2){
            StringBuilder temp = new StringBuilder();
            for(int i=0;i<sb.length()-1;i++){
                int n1 = sb.charAt(i)-'0';
                int n2 = sb.charAt(i+1)-'0';
                int num = (n1+n2)%10;
                temp.append(num);
            }
            sb=new StringBuilder(temp);
        }
        return sb.charAt(0)==sb.charAt(1);
    }
}
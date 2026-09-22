class Solution {
    public boolean squareIsWhite(String coordinates) {
        int n1 = coordinates.charAt(0)-'a'+1;
        int n2 = coordinates.charAt(1)-'0';
        return (n1+n2)%2==0 ? false:true;
    }
}
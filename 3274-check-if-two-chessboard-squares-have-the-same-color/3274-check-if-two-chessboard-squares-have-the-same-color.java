class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        int x1 = c1.charAt(0)-'a'+1;
        int y1 = c1.charAt(1)-'1'+1;
        int x2 = c2.charAt(0)-'a'+1;
        int y2 = c2.charAt(1)-'1'+1;
        if(((x1+x2)%2==0 && (y1+y2)%2==0) || (x1+x2)%2!=0 && (y1+y2)%2!=0) return true;
        return false;
    }
}
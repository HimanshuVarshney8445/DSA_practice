class Solution {
    public String find(int n){
        StringBuilder sb = new StringBuilder();
        while(n!=0){
            int r = n%2;
            sb.append(r);
            n/=2;
        }
        return sb.reverse().toString();
    }
    public String convertDateToBinary(String date) {
        String[] str = date.split("-");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length;i++){
            int num = Integer.parseInt(str[i]);
            String temp = find(num);
            sb.append(temp);
            if (i < str.length - 1) {
                sb.append("-");
            }
        }
        return sb.toString();
    }
}
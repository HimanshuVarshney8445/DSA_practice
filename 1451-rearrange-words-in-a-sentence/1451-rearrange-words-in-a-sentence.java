class Solution {
    public String arrangeWords(String text) {
        String[] str = text.split(" ");
        Arrays.sort(str,(i,j) -> i.length()-j.length());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length;i++){
            if(i==0){
                sb.append(str[i].substring(0,1).toUpperCase()+str[i].substring(1));
            }else{
                sb.append(str[i].toLowerCase());
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
class Solution {
    public boolean find(String str,String target){
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (target.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }
    public String[] findWords(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";
        for(int i=0;i<words.length;i++){
            String temp = words[i].toLowerCase();
            if(find(temp,first) || find(temp,second) || find(temp,third)){
                list.add(words[i]);
            }
        }
        String[] temp = new String[list.size()];
        for(int i=0;i<list.size();i++){
            temp[i]=list.get(i);
        }
        return temp;
    }
}
class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int ans=0;
        int am=0,ap=0,ag=0;
        for(int i=0;i<garbage.length;i++){
            String str = garbage[i];
            for(int j=0;j<str.length();j++){
                char ch = str.charAt(j);
                if(ch=='M'){
                    am=i;
                }else if(ch=='P'){
                    ap=i;
                }else{
                    ag=i;
                }
            }
        }
        for (String str : garbage) {
            ans += str.length();
        }
        for (int i = 0; i < am; i++) {
            ans += travel[i];
        }
        for (int i = 0; i < ap; i++) {
            ans += travel[i];
        }
        for (int i = 0; i < ag; i++) {
            ans += travel[i];
        }
        return ans;
    }
}
// 3+1+10+1 = 15
// 3+3+1 = 7
// 3+1+10+1 = 15
// total = 37
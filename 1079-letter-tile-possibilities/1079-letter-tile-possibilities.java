class Solution {
    public void find(String tiles,String temp,boolean[] visited,HashSet<String> set){
        for(int i=0;i<tiles.length();i++){
            if(visited[i]) continue;
            String str = temp+tiles.charAt(i);
            visited[i]=true;
            set.add(str);
            find(tiles,str,visited,set);
            visited[i]=false;
        }
    }
    public int numTilePossibilities(String tiles) {
        HashSet<String> set = new HashSet<>();
        boolean[] visited = new boolean[tiles.length()];
        find(tiles,"",visited,set);
        return set.size();
    }
}
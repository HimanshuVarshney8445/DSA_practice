class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> zero = new HashSet<>();
        Set<Integer> one = new HashSet<>();
        Set<Integer> more = new HashSet<>();
        List<List<Integer>> temp = new ArrayList<>();
        for(int i=0;i<matches.length;i++){
            int win = matches[i][0];
            int lose = matches[i][1];
            if(!more.contains(win) && !one.contains(win) && !zero.contains(win)){
                zero.add(win);
            }
            if(zero.contains(lose)){
                zero.remove(Integer.valueOf(lose));
                one.add(lose);
            }else if(one.contains(lose)){
                one.remove(Integer.valueOf(lose));
                more.add(lose);
            }else if(more.contains(lose)){
                continue;
            }else{
                one.add(lose);
            }
        }
        List<Integer> zeroList = new ArrayList<>(zero);
        List<Integer> oneList = new ArrayList<>(one);
        Collections.sort(zeroList);
        Collections.sort(oneList);
        temp.add(zeroList);
        temp.add(oneList);
        return temp;
    }
}
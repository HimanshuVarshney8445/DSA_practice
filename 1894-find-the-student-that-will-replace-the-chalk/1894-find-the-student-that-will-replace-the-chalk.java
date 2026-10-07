class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int n=chalk.length;
        int i=0;
        long sum=0;
        for(int t:chalk) sum+=t;
        k%=sum;
        while(k>0 && k>=chalk[i%n]){
            int a = i%n;
            k-=chalk[a];
            i++;
        }
        return i%n;
    }
}
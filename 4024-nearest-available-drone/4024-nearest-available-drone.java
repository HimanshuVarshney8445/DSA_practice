class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int min=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<drones.length;i++){
            int n1=drones[i][0];
            int n2=drones[i][1];
            int n3=drones[i][2];
            int sum = Math.abs(n1-target[0])+Math.abs(n2-target[1]);
            if(sum<=n3 && sum<min){
                index=i;
                min=sum;
            }
        }
        return index;
    }
}
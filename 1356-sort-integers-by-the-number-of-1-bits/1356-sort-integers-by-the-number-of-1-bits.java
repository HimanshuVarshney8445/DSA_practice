class Solution {
    public int find(int n) {
        int count = 0;
        while (n != 0) {
            int r = n % 2;
            if (r == 1) count++;
            n /= 2;
        }
        return count;
    }
    public int[] sortByBits(int[] arr) {
        int[][] temp = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            temp[i][0] = arr[i];
            temp[i][1] = find(arr[i]);
        }
        Arrays.sort(temp, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i][0];
        }
        return arr;
    }
}
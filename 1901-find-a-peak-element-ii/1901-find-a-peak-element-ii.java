class Solution {
    private boolean isPeak(int[][] a, int i, int j) {
        int n = a.length;
        int m = a[0].length;

        int up = (i > 0) ? a[i - 1][j] : -1;
        int down = (i < n - 1) ? a[i + 1][j] : -1;
        int left = (j > 0) ? a[i][j - 1] : -1;
        int right = (j < m - 1) ? a[i][j + 1] : -1;

        return a[i][j] > up && a[i][j] > down && a[i][j] > left && a[i][j] > right;
    }

    public int[] findPeakGrid(int[][] a) {
        int n = a.length;
        int m = a[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isPeak(a, i, j)) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
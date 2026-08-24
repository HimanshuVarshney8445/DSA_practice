class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        for (int startRow = 0; startRow < m; startRow++) {
            List<Integer> diagonal = new ArrayList<>();
            int r = startRow;
            int c = 0;
            while (r < m && c < n) {
                diagonal.add(mat[r][c]);
                r++;
                c++;
            }
            Collections.sort(diagonal);
            r = startRow;
            c = 0;
            int i = 0;
            while (r < m && c < n) {
                mat[r][c] = diagonal.get(i++);
                r++;
                c++;
            }
        }

        for (int startCol = 1; startCol < n; startCol++) {
            List<Integer> diagonal = new ArrayList<>();
            int r = 0;
            int c = startCol;
            while (r < m && c < n) {
                diagonal.add(mat[r][c]);
                r++;
                c++;
            }
            Collections.sort(diagonal);
            r = 0;
            c = startCol;
            int i = 0;
            while (r < m && c < n) {
                mat[r][c] = diagonal.get(i++);
                r++;
                c++;
            }
        }
        return mat;
    }
}
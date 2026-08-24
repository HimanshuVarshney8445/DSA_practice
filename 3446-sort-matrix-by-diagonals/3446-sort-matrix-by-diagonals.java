class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        for (int startRow = n - 1; startRow >= 0; startRow--) {
            List<Integer> diagonal = new ArrayList<>();
            int r = startRow;
            int c = 0;
            while (r < n && c < n) {
                diagonal.add(grid[r][c]);
                r++;
                c++;
            }
            Collections.sort(diagonal, Collections.reverseOrder());
            r = startRow;
            c = 0;
            int index = 0;
            while (r < n && c < n) {
                grid[r][c] = diagonal.get(index++);
                r++;
                c++;
            }
        }

        for (int startCol = 1; startCol < n; startCol++) {
            List<Integer> diagonal = new ArrayList<>();
            int r = 0;
            int c = startCol;
            while (r < n && c < n) {
                diagonal.add(grid[r][c]);
                r++;
                c++;
            }
            Collections.sort(diagonal);
            r = 0;
            c = startCol;
            int index = 0;
            while (r < n && c < n) {
                grid[r][c] = diagonal.get(index++);
                r++;
                c++;
            }
        }
        return grid;
    }
}
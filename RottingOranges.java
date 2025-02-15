class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int freshOranges = 0;
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j, 0});
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }

        int[] drow = {0, -1, 0, 1};
        int[] dcol = {-1, 0, 1, 0};
        int maxTime = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0], col = current[1], time = current[2];
            maxTime = Math.max(maxTime, time);

            for (int i = 0; i < 4; i++) {
                int nrow = row + drow[i];
                int ncol = col + dcol[i];

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && grid[nrow][ncol] == 1) {
                    grid[nrow][ncol] = 2;
                    freshOranges--;
                    queue.offer(new int[]{nrow, ncol, time + 1});
                }
            }
        }

        return freshOranges == 0 ? maxTime : -1;
    }
}
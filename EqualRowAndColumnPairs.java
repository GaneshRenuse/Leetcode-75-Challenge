import java.util.*;

public class EqualRowAndColumnPairs {
    public static int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> rowMap = new HashMap<>();
        int count = 0;

        for (int[] row : grid) {
            String rowKey = Arrays.toString(row);
            rowMap.put(rowKey, rowMap.getOrDefault(rowKey, 0) + 1);
        }

        for (int col = 0; col < n; col++) {
            int[] colArray = new int[n];
            for (int row = 0; row < n; row++) {
                colArray[row] = grid[row][col];
            }
            String colKey = Arrays.toString(colArray);

            count += rowMap.getOrDefault(colKey, 0);
        }

        return count;
    }
    public static void main(String[] args) {
        // pass the attributes
    }
}

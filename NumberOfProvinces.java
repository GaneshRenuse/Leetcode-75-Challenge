class Solution {
    public void DFS(int u, int[][] isConnected, boolean[] visited) {
        visited[u] = true;
        for (int v = 0; v < isConnected.length; v++) {
            if (!visited[v] && isConnected[u][v] == 1) {
                DFS(v, isConnected, visited);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                DFS(i, isConnected, visited);
            }
        }
        return count;
    }
}

public class NumberOfProvinces {
    public static void main(String[] args) {
        
    }
}

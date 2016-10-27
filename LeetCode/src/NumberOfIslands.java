/**
 * Created by Mathurs on 10/27/16.
 *
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 Example 1:

 11110
 11010
 11000
 00000
 Answer: 1

 Example 2:

 11000
 11000
 00100
 00011
 Answer: 3
 *
 */
public class NumberOfIslands {
    public int numIslands(char[][] grid) {

        if(grid == null || grid.length  == 0 || grid[0].length == 0)
            return 0;
        int m = grid.length;
        int n = grid[0].length;
        System.out.println(m + ", "+ n);
        boolean[][] visited = new boolean[m][n];
        int result = 0;
        for(int i = 0 ; i < m; i++){
            for(int j = 0 ; j < n ; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    dfs(grid , visited, m , n, i , j);
                    result++;
                }

            }
        }
        return result;
    }

    private void dfs(char[][] grid , boolean[][] visited , int m , int n ,int x, int y){
        if(x < 0 || x >= m || y < 0 || y >= n )
            return;

        if(visited[x][y] || grid[x][y] == '0')
            return;

        visited[x][y] = true;


        // dfs(grid , visited , m, n, x - 1 , y + 1);
        dfs(grid , visited , m, n,  x -1 , y);
        // dfs(grid , visited ,  m, n, x -1  , y - 1);
        dfs(grid , visited ,  m, n, x   , y -1 );
        // dfs(grid , visited ,  m, n, x + 1  , y - 1);
        dfs(grid , visited ,  m, n, x + 1  , y);
        // dfs(grid , visited ,  m, n, x + 1  , y + 1);
        dfs(grid , visited ,  m, n, x   , y + 1);


    }
}

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Mathurs on 11/25/16.
 */
public class ShortestDistancefromAllBuildings {
    static int[][] distance;
    static int[][] reach;
    public int shortestDistance(int[][] grid) {

        if(grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;

        int m = grid.length;
        int n = grid[0].length;
        distance = new int[m][n];
        reach = new int[m][n];

        List<Building> buildings = new LinkedList<>();

        for(int i = 0 ; i < m ; i ++){
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == 1)
                    buildings.add(new Building(i , j , 0));
            }
        }

        int numBuil = buildings.size();

        for (Building b : buildings) {
            bfs(b, grid , m , n);
            for (int[] arr : distance) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
        }


        int result = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == 0 && reach[i][j] == numBuil)
                    result = Math.min(result , distance[i][j]);
            }

        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    private void bfs(Building b , int[][] grid , int m , int n){

        boolean[][] visited = new boolean[m][n];
        Queue<Building> queue = new LinkedList<>();
        queue.add(new Building(b.x , b.y , 0));
        visited[b.x][b.y] = true;

        while(!queue.isEmpty()){
            Building b1 = queue.remove();
            reach[b1.x][b1.y]++;

            if(b1.x > 0 && !visited[b1.x -1 ][b1.y] && grid[b1.x -1 ][b1.y] == 0){
                visited[b1.x -1 ][b1.y] = true;
                distance[b1.x -1 ][b1.y] += b1.dist + 1;
                queue.add(new Building(b1.x -1 ,b1.y , b1.dist +1));
            }

            if(b1.x < m - 1 && !visited[b1.x + 1 ][b1.y] && grid[b1.x + 1 ][b1.y] == 0){
                visited[b1.x + 1 ][b1.y] = true;
                distance[b1.x + 1 ][b1.y] += b1.dist+ 1;
                queue.add(new Building(b1.x +1 , b1.y, b1.dist+1));
            }

            if(b1.y > 0 && !visited[b1.x ][b1.y -1] && grid[b1.x][b1.y -1] == 0){
                visited[b1.x][b1.y -1 ] = true;
                distance[b1.x][b1.y -1] += b1.dist + 1;
                queue.add(new Building(b1.x ,b1.y -1 , b1.dist +1));
            }


            if(b1.y < n - 1 && !visited[b1.x][b1.y +1] && grid[b1.x ][b1.y +1] == 0){
                visited[b1.x ][b1.y+1] = true;
                distance[b1.x][b1.y+1] += b1.dist+ 1;
                queue.add(new Building(b1.x , b1.y+1, b1.dist+1));
            }

        }


    }

    public static void main(String[] args) {
        int[][] input = {{1,0,2,2,1},{0,0,0,2,2},{0,0,1,0,0}};
        ShortestDistancefromAllBuildings solution = new ShortestDistancefromAllBuildings();
        System.out.println(solution.shortestDistance(input));

        for (int[] arr : distance) {
            System.out.println(Arrays.toString(arr));
        }
    }

    private class Building{
        int x ;
        int y;
        int dist;

        public Building(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
}

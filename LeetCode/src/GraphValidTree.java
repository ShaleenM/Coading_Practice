import java.util.*;

/**
 * Created by Mathurs on 11/26/16.
 */
public class GraphValidTree {

    public boolean validTree(int n, int[][] edges) {

        // Make Adjacency list
        HashMap<Integer, List<Integer>> adjList = new HashMap<>();
        for(int[] edge : edges){
            if(adjList.containsKey(edge[0]))
                adjList.get(edge[0]).add(edge[1]);
            else{
                List<Integer> list = new LinkedList<>();
                list.add(edge[1]);
                adjList.put(edge[0], list);
            }

            if(adjList.containsKey(edge[1]))
                adjList.get(edge[1]).add(edge[0]);
            else {
                List<Integer> list = new LinkedList<>();
                list.add(edge[0]);
                adjList.put(edge[1], list);
            }
        }

        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(edges[0][0]);
        visited.add(edges[0][0]);

        while(!queue.isEmpty()){
            int root = queue.remove();
            if(visited.contains(root))
                return false;
            visited.add(root);
            for(int node : adjList.get(root)){
                if(!visited.contains(node))
                    queue.add(node);
            }
        }

        return visited.size() < n ? false : true;

    }
}

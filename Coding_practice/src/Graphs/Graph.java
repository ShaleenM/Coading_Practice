package Graphs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Mathurs on 10/13/16.
 */
public class Graph {

    Vertex[] adjacencyList;

    public Graph(String file) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(file));
        String typeOfGraph = sc.next();
        boolean undirected = true;

        if (typeOfGraph.equals("directed")) {
            undirected = false;
        }

        int numberOfVertices = sc.nextInt();
        adjacencyList = new Vertex[numberOfVertices];
        //To read vertices
        for (int i = 0; i < numberOfVertices; i++) {
            Vertex vertexName = new Vertex(sc.next(), null);
            adjacencyList[i] = vertexName;
        }

        //To Read relation between different vertices (Edges)
        while (sc.hasNextLine()) {
            String startAndEndVertex = sc.nextLine().toString();
            if (startAndEndVertex.equals("")) {
                continue;
            }
            System.out.println(startAndEndVertex);
            String[] st = startAndEndVertex.split("\\s+");
            if (st.length == 1) {
                System.out.println("Please mention both the vertices of the edge and try again");
                return;
            }
            int v1 = indexOfVertex(st[0]);
            int v2 = indexOfVertex(st[1]);

            if (v1 == -1 || v2 == -1) {
                System.out.println("Mentioned Vertices does not exist!!");
                return;
            }
            adjacencyList[v1].next = new Neighbour(v2, adjacencyList[v1].next);
            if (undirected) {
                adjacencyList[v2].next = new Neighbour(v1, adjacencyList[v2].next);

            }


        }
    }


    private int indexOfVertex(String input) {
        for (int i = 0; i < adjacencyList.length; i++) {
            if (adjacencyList[i].vertex_name.equals(input)) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        if (adjacencyList.length == 0) {
            System.out.println("Empty List");
            return;
        } else {
            for (int i = 0; i < adjacencyList.length; i++) {
                System.out.print(adjacencyList[i].vertex_name + " ");
                Neighbour iterator = adjacencyList[i].next;
                while (iterator != null) {
                    System.out.print(" ----> " + adjacencyList[iterator.vertex_number].vertex_name);
                    iterator = iterator.next;
                }
                System.out.print("\n");
            }
        }
    }

    public void dfs(){

        boolean visited[]  = new boolean[adjacencyList.length];
        for(int i = 0 ; i < visited.length ; i++)
            visited[i] = false;

        for(int i = 0 ; i < adjacencyList.length ; i++){
            if(!visited[i])
                dfs(i, visited);
        }
    }

    private void dfs(int vertex, boolean[] visited){
        visited[vertex] = true;

        for(Neighbour nbr = adjacencyList[vertex].next ; nbr != null ; nbr = nbr.next){
            if(visited[nbr.vertex_number])
                dfs(nbr.vertex_number , visited);
        }
    }

    public void bfs(){
        boolean[] visited = new boolean[adjacencyList.length];

        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = 0 ; i < adjacencyList.length ; i++){
            if(!visited[i])
                bfs(i , visited , queue);
        }
    }

    private void bfs(int vertex, boolean[] visited, Queue<Integer> queue){

        visited[vertex] = true;
        System.out.println("Visited : "+ adjacencyList[vertex].vertex_name);
        queue.add(vertex);

        while(!queue.isEmpty()){

            vertex = queue.poll();

            for(Neighbour nbr = adjacencyList[vertex].next ; nbr != null ; nbr = nbr.next){
                if(!visited[nbr.vertex_number]) {
                    visited[vertex] = true;
                    System.out.println("Visited : "+ adjacencyList[vertex].vertex_name);
                    queue.add(nbr.vertex_number);
                }
            }

        }
    }
}

class Neighbour {
    int vertex_number;
    Neighbour next;

    Neighbour(int vertex_number, Neighbour nbr) {
        this.vertex_number = vertex_number;
        next = nbr;
    }
}

class Vertex {
    String vertex_name;
    Neighbour next;

    Vertex(String vertex_name, Neighbour nbr) {
        this.vertex_name = vertex_name;
        this.next = nbr;
    }

}
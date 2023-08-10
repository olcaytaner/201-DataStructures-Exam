package Array.Graph;

import Array.DisjointSet;
import Array.Element;
import Array.Heap.HeapNode;
import Array.Heap.MinHeap;
import Array.Queue;
import General.AbstractGraph;
import General.Path;
import List.Graph.Edge;

public class Graph extends AbstractGraph {

    private int[][] edges;

    public Graph(int vertexCount){
        super(vertexCount);
        edges = new int[vertexCount][vertexCount];
        for (int i = 0; i < vertexCount; i++){
            for (int j = 0; j < vertexCount; j++){
                edges[i][j] = 0;
            }
        }
    }

    public void addEdge(int from, int to){
        edges[from][to] = 1;
    }

    public void addEdge(int from, int to, int weight){
        edges[from][to] = weight;
    }

    protected void depthFirstSearch(boolean[] visited, int fromNode){
        for (int toNode = 0; toNode < vertexCount; toNode++){
            if (edges[fromNode][toNode] > 0){
                if (!visited[toNode]){
                    visited[toNode] = true;
                    depthFirstSearch(visited, toNode);
                }
            }
        }
    }

    protected void breadthFirstSearch(boolean[] visited, int startNode){
        int fromNode;
        Queue queue = new Queue(100);
        queue.enqueue(new Element(startNode));
        while (!queue.isEmpty()){
            fromNode = queue.dequeue().getData();
            for (int toNode = 0; toNode < vertexCount; toNode++) {
                if (edges[fromNode][toNode] > 0) {
                    if (!visited[toNode]){
                        visited[toNode] = true;
                        queue.enqueue(new Element(toNode));
                    }
                }
            }
        }
    }


}

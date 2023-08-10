package List.Graph;

import General.AbstractGraph;
import List.Node;
import List.Queue;

public class Graph extends AbstractGraph {
    private EdgeList[] edges;

    public Graph(int vertexCount){
        super(vertexCount);
        edges = new EdgeList[vertexCount];
        for (int i = 0; i < vertexCount; i++){
            edges[i] = new EdgeList();
        }
    }

    public void addEdge(int from, int to){
        Edge edge = new Edge(from, to, 1);
        edges[from].insert(edge);
    }

    public void addEdge(int from, int to, int weight){
        Edge edge = new Edge(from, to, weight);
        edges[from].insert(edge);
    }

    protected void depthFirstSearch(boolean[] visited, int fromNode){
        Edge edge;
        int toNode;
        edge = edges[fromNode].getHead();
        while (edge != null){
            toNode = edge.getTo();
            if (!visited[toNode]){
                visited[toNode] = true;
                depthFirstSearch(visited, toNode);
            }
            edge = edge.getNext();
        }
    }

    protected void breadthFirstSearch(boolean[] visited, int startNode){
        Edge edge;
        int fromNode, toNode;
        Queue queue = new Queue();
        queue.enqueue(new Node(startNode));
        while (!queue.isEmpty()){
            fromNode = queue.dequeue().getData();
            edge = edges[fromNode].getHead();
            while (edge != null) {
                toNode = edge.getTo();
                if (!visited[toNode]){
                    visited[toNode] = true;
                    queue.enqueue(new Node(toNode));
                }
                edge = edge.getNext();
            }
        }
    }

}

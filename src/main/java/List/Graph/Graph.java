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

    public Graph(int vertexCount, int[][] edges){
        this(vertexCount);
        for (int[] edge : edges) {
            if (edge.length == 2) {
                addEdge(edge[0], edge[1]);
            } else {
                if (edge.length == 3){
                    addEdge(edge[0], edge[1], edge[2]);
                }
            }
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

    public String toString(){
        String s = "";
        for (int i = 0; i < vertexCount; i++){
            Edge edge = edges[i].getHead();
            while (edge != null){
                s += edge.getFrom() + " " + edge.getTo() + " " +  edge.getWeight() + "\n";
                edge = edge.getNext();
            }
        }
        return s;
    }

    /**
     * Write a new constructor for Graph class for linked list implementation which constructs a new graph by
     * merging all graphs in the graph array. Size represents the number of graphs in graphs. You can assume that
     * all graphs have the same size, and the intersections of the graphs are empty.
     */
    public Graph(Graph[] graphs){
    }

    /**
     * Write a function that computes the number of bidirectional edges in a graph. Write the function for adjacency
     * list representation.
     */
    public int bidirectionalEdges(){
        return 0;
    }

    /**
     * Modify the breadth first search linked list implementation of Graph such that it checks if there is a path
     * from the node index1 to index2.
     */
    public boolean breadthFirstSearch(boolean[] visit, int index1, int index2){
        return false;
    }

    /**
     * Write the method in linked list implementation which constructs a graph from numbers 0, 1, 2, $\ldots$,
     * N - 1; where the numbers represent the node indexes and two nodes are connected if they have common divisor
     * other than 1.
     */
    public Graph constructGraphFromNumbers(int N){
        return null;
    }

    /**
     * Write the method in linked list implementation of {\bf Graph} class that returns a new graph formed by adding
     * edges which exist both in the original graph and g2. You may assume both graphs are unweighted.
     */
    public Graph intersection(Graph g2, int v){
        return null;
    }

    /**
     * Write the method in linked list implementation which constructs an inverse graph of a given graph in linked
     * list implementation. In inverse graph, two distinct vertices are adjacent if and only if they are not adjacent
     * in the original graph. You are not allowed to use extra data structures apart from the constructed graph.
     */
    public Graph inverseGraph(){
        return null;
    }

    /**
     * A bipartite graph is a graph such that vertices of the graph can be partitioned into two subsets such that no
     * edge has both its vertices in the same subset. Write a method for adjacency list representation which checks
     * if the corresponding graph is bipartite or not. Hint: Use Depth or breath first search to traverse the graph.
     */
    public boolean isBipartite(){
        return false;
    }

    /**
     * A graph represents a ring topology if all the nodes create a circular path. Each node is connected to two
     * others, like points on a circle. Write a class method in Graph class for adjacency list representation which
     * checks if the corresponding graph is circular or not.
     */
    public boolean isCircular(){
        return false;
    }

    /**
     * Write a method that checks if the graph is fully connected or not.
     */
    public boolean isFullyConnected(){
        return false;
    }

    /**
     * Write a method which checks if two graphs are the same. Assume that, the method is written in the Adjacency
     * list representation of a graph.
     */
    public boolean isSame(Graph g){
        return false;
    }

    /**
     * Write the method in linked list implementation of {\bf Graph} class that returns a new graph formed by adding
     * edges which exist in the original graph or g2. You may assume both graphs are weighted, if an edge exists in
     * both graphs, add the resulting edge with the sum of their weights. You are not allowed to use any linked list
     * methods.
     */
    public Graph merge(Graph g2, int v){
        return null;
    }

    /**
     * Given the adjacency list representation of a graph G, write a method which returns true if there are two
     * nodes whose outgoing node lists are the same, false otherwise. Assume that the outgoing node lists are
     * sorted. Your method should run in ${\cal O}(V^3)$ time.
     */
    public boolean outgoingListSame(){
        return false;
    }

    /**
     * Modify the breadth first search {\bf linked list} implementation such that it will store the length of the
     * shortest paths from the start node in {\em lengths} parameter. At the end of the execution, lengths[i] will
     * show the shortest path length from node $start$ to node $i$. You may assume that the path length elements are
     * initialized to $vertexCount$ (number of nodes, which should be larger than any possible shortest path) when
     * you call the function.
     */
    public void shortest(int[] lengths, int start){

    }

    /**
     * Modify the breadth first search {\bf linked list} implementation such that it will store the indexes of the
     * nodes of the shortest paths from the start node in {\em paths} parameter. At the end of the execution, the
     * indexes in the paths[i] array will show the path visited from node $start$ to node $i$. You may assume that
     * the visited array is initialized to false and paths array is already allocated.
     */
    public void shortest(int[][] path, boolean[] visited, int start){

    }

    /**
     * For a directed weighted graph, write the method in linked list implementation which returns the shortest
     * distance between the nodes index1 and index2 by two hops, that is, it will return of the shortest of all
     * paths, where one goes from index1 node to node $i$, then from node $i$ to node $index2$.
     */
    public int shortestIn2Hops(int index1, int index2){
        return 0;
    }

    /**
     * Write the method in linked list implementation which returns the indexes of the nodes which are reachable by
     * two hops, that is, it will consist of all indexes $j$, where one goes from index node to node $i$, then from
     * node $i$ to node $j$. The size of the returning array should be as much as needed. If there are two or more
     * ways to go to a node $j$, then $j$ must appear that many times in the list (no need to sort or check for
     * duplicates).
     */
    public int[] twoHops(int index){
        return null;
    }

    /**
     Write a new constructor for Graph class for linked list implementation which constructs a new graph by insersection of all graphs in the
     graph array, where edge is included in the constructed when such edge appears in at least minCount number of graphs. Size represents the
     number of graphs in graphs variable. You may assume that all graphs have the same size and same set of vertices.
     */
    public Graph(Graph[] graphs, int minCount) {}

    /**
     * Write the method in linked list implementation which returns the number of odd-valued
     * edges, where an edge is odd-valued if its two distinct node values are both odd.
     * You are not allowed to use extra data structures.
     */
    public int oddEdgeGraph() { return 0; }
}

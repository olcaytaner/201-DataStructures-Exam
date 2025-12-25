package Array.Graph;

import Array.Element;
import Array.Queue;
import General.AbstractGraph;

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

    public Graph(int vertexCount, int[][] edges){
        this(vertexCount);
        for (int[] edge : edges) {
            if (edges[0].length == 2){
                addEdge(edge[0], edge[1]);
            } else {
                if (edges[0].length == 3){
                    addEdge(edge[0], edge[1], edge[2]);
                }
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

    public String toString(){
        String s = "";
        for (int i = 0; i < vertexCount; i++){
            for(int j = 0; j < vertexCount; j++){
                if(edges[i][j] > 0){
                    s += i + " " + j + " " + edges[i][j] + "\n";
                }
            }
        }
        return s.trim();
    }

    /**
     * Given a weighted undirected graph representing the distances between cities in a country, write a method in
     * adjacency matrix representation which identifies the index of the capital city. The capital city has the
     * largest number of nearby cities compared to other cities. A city A is nearby to a city B, if its direct
     * distance to city B is the smallest across all cities compared. Identify the number of nearby cities for every
     * city, and use one array to store the number of nearby cities for every city.
     */
    public int capitalCity(){
        return 0;
    }

    /**
     * Given a directed graph represented by adjacency matrix, write a recursive method in the Graph class that
     * determines whether the graph contains any cycles starting form vertex v. Use the same idea in Depth-First
     * Search (DFS). Your method should return true if there is at least one cycle in the graph, and false otherwise.
     */
    public boolean hasCycle(int v, boolean[] visited){
        return false;
    }

    /**
     * Write a method that checks if the graph is complete bipartite graph or not. Write the function for adjacency
     * matrix representation. A graph $(V_1, V_2)$ is said to be a complete bipartite graph if every vertex in
     * $V_1$ is connected to every vertex of $V_2$.
     */
    public boolean isCompleteBipartite(){
        return false;
    }

    /**
     * Write the method in array~(adjacency matrix) implementation which returns whether graph is a star graph or
     * not. Star graph is obtained by connecting a node to all the remaining nodes. If a graph has n nodes, there are
     * n-1 edges as shown in example star graph below. You are not allowed to use depth first search or breadth
     * first search.
     */
    public boolean isStarGraph(){
        return false;
    }

    /**
     * Write the method in array implementation which returns true if g is a subgraph of the current graph, false
     * otherwise. A graph $G_1$ is a subgraph of graph $G_2$ if every edge of graph $G_1$ is also an edge in graph
     * $G_2$.
     */
    public boolean isSubGraph(Graph g){
        return false;
    }

    /**
     * For a directed weighted graph, write the method in array implementation which returns length of the circle
     * assuming that the graph is a circular graph. A graph is circular if all the nodes create a circular path.
     * Each node is connected to two others, like points on a circle.
     */
    public int lengthOfCircle(){
        return 0;
    }

    /**
     * Write the method in array implementation which returns the number of complete subgraphs in the graph. A
     * complete graph is a graph, in which all vertices are connected to all vertices. Assume that the graph only
     * consists of complete subgraphs of size $>$ 1, there are no extra vertices, which is not in a complete
     * subgraph. You are not allowed to use depth first search or breadth first search. In the graph below
     * (1, 2, 5), (3, 6) and (4, 7) are complete subgraphs.
     */
    public int numberOfCompleteSubGraphs(){
        return 0;
    }

    /**
     * The adjacency matrix $M$ represents the number of ways to travel between pairs of nodes in a graph in exactly
     * one move. $M^k$ represents the number of ways to travel between pair of nodes in a graph in exactly k moves.
     * Write the method which calculates and returns $M^2$ for a graph. Your method should run in ${\cal O}(V^3)$
     * time.
     */
    public int[][] numberOfWaysInTwoMoves(){
        return null;
    }

    /**
     * Write a method to find the out-degree of a node given its index.
     */
    public int outDegree(int index){
        return 0;
    }

    /**
     * Given the adjacency matrix representation of a graph G, write a method which returns true if there are two
     * nodes whose outgoing node lists are the same, false otherwise. Your method should run in ${\cal O}(V^3)$
     * time.
     */
    public boolean outgoingListSame(){
        return false;
    }

    /**
     Write the method in array~(adjacency matrix) implementation of undirected Graph which returns whether graph is a two-graph or not. You may assume
     graph is connected. A two-graph is a graph where degree of all vertices are 2. You are not allowed to use depth first search or breadth
     first search.
     */
    public boolean isTwoGraph() { return false; }

}

import Array.Graph.Graph;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestArrayGraph {

    @Test
    public void testCapitalCity(){
        Graph graph = new Graph(3,
                new int[][]{{0, 1, 1}, {0, 2, 2}, {1, 0, 1},
                {1, 2, 10}, {2, 0, 2}, {2, 1, 10}});
        assertEquals(0, graph.capitalCity());
        int INF = 1000;
        graph = new Graph(4,
                new int[][]{{0, 1, 1}, {0, 2, INF}, {0, 3, INF},
                        {1, 0, 1}, {1, 2, 1}, {1, 3, INF},
                        {2, 0, INF}, {2, 1, 1}, {2, 3, 1},
                        {3, 0, INF}, {3, 1, INF}, {3, 2, 1}});
        assertEquals(1, graph.capitalCity());
    }

    @Test
    public void testHasCycle(){
        Graph graph = new Graph(6,
                new int[][]{{0, 1}, {1, 2}, {2, 3},
                        {3, 0}, {3, 1}, {4, 5}});
        assertTrue(graph.hasCycle(0, new boolean[6]));
        assertTrue(graph.hasCycle(3, new boolean[6]));
        assertFalse(graph.hasCycle(3, new boolean[6]));
    }

    @Test
    public void testIsCompleteBipartite(){
        Graph graph = new Graph(6,
                new int[][]{{0, 3}, {0, 4}, {0, 5},
                        {1, 3}, {1, 4}, {1, 5},
                        {2, 3}, {2, 4}, {2, 5}});
        assertTrue(graph.isCompleteBipartite());
        Graph graph2 = new Graph(6,
                new int[][]{{0, 1}, {1, 2}, {2, 3},
                {3, 0}, {3, 1}, {4, 5}});
        assertFalse(graph2.isCompleteBipartite());
    }

    @Test
    public void testIsStarGraph(){
        Graph graph = new Graph(6,
                new int[][]{{0, 1}, {0, 2}, {0, 3},
                {0, 4}, {0, 5}});
        assertTrue(graph.isStarGraph());
        Graph graph2 = new Graph(6,
                new int[][]{{0, 1}, {1, 2}, {2, 3},
                {3, 0}, {3, 1}, {4, 5}});
        assertFalse(graph2.isStarGraph());
    }

    @Test
    public void testIsSubGraph(){
        Graph graph = new Graph(6,
                new int[][]{{0, 1}, {0, 2}, {1, 3},
                {0, 4}, {0, 5}});
        Graph temp = new Graph(4,
                new int[][]{{0, 1}, {0, 2}, {1, 3}, {0, 4}});
        assertTrue(graph.isSubGraph(temp));
        Graph graph2 = new Graph(6,
                new int[][]{{0, 1}, {1, 2}, {2, 3},
                {3, 0}, {3, 1}, {4, 5}});
        temp = new Graph(5,
                new int[][]{{0, 1}, {0, 2}, {1, 3}, {0, 4}});
        assertFalse(graph2.isSubGraph(temp));
    }

    @Test
    public void testLengthOfCircle(){
        Graph graph = new Graph(4,
                new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 0}});
        assertEquals(4, graph.lengthOfCircle());
        graph = new Graph(5,
                new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 0}});
        assertEquals(4, graph.lengthOfCircle());
        graph = new Graph(6,
                new int[][]{{0, 1}, {1, 2}, {2, 3},
                        {3, 4}, {4, 0}});
        assertEquals(5, graph.lengthOfCircle());
    }

    @Test
    public void testNumberOfCompleteSubGraphs(){
        Graph graph = new Graph(5,
                new int[][]{{0, 1}, {1, 0}, {1, 2},
                        {2, 1}, {0, 2}, {2, 0},
                        {3, 4}, {4, 3}});
        assertEquals(2, graph.numberOfCompleteSubGraphs());
        graph = new Graph(5,
                new int[][]{{0, 1}, {1, 0}, {1, 2},
                        {2, 1}, {0, 2}, {2, 0}});
        assertEquals(1, graph.numberOfCompleteSubGraphs());
        graph = new Graph(7,
                new int[][]{{0, 1}, {1, 0}, {1, 2},
                {2, 1}, {0, 2}, {2, 0},
                {3, 4}, {4, 3}, {5, 6},
                        {6, 5}});
        assertEquals(3, graph.numberOfCompleteSubGraphs());
    }

    @Test
    public void testNumberOfWaysInTwoMoves(){
        int[][] expected = {{0, 0}, {0, 0}};
        Graph graph = new Graph(2, new int[][]{{0, 1}});
        int[][] actual = graph.numberOfWaysInTwoMoves();
        assertArrayEquals(expected, actual);
        int[][] expected2 = {{1, 0}, {0, 1}};
        graph = new Graph(2, new int[][]{{0, 1}, {1, 0}});
        int[][] actual2 = graph.numberOfWaysInTwoMoves();
        assertArrayEquals(expected2, actual2);
        int[][] expected3 = {{0, 0, 1}, {0, 0, 0}, {0, 0, 0}};
        graph = new Graph(3, new int[][]{{0, 1}, {1, 2}});
        int[][] actual3 = graph.numberOfWaysInTwoMoves();
        assertArrayEquals(expected3, actual3);
    }

    @Test
    public void testOutDegree() {
        Graph graph = new Graph(4,
                new int[][]{{0, 1}, {0, 2}, {0, 3},
                {2, 1}, {1, 2}});
        assertEquals(3, graph.outDegree(0));
        graph = new Graph(4,
                new int[][]{{0, 1}, {0, 2}, {1, 3},
                {2, 1}, {1, 2}});
        assertEquals(2, graph.outDegree(1));
    }

    @Test
    public void testOutgoingListSame() {
        Graph graph = new Graph(6,
                new int[][]{{0, 1}, {0, 3}, {0, 4},
                {2, 1}, {2, 3}, {2, 4},
                {4, 0}, {5, 1}});
        assertTrue(graph.outgoingListSame());
        graph = new Graph(5,
                new int[][]{{0, 1}, {1, 2}, {2, 3},
                {3, 4}, {4, 0}});
        assertFalse(graph.outgoingListSame());
    }

    @Test
    public void testIsTwoGraph(){
        Graph graph = new Graph(4,
                new int[][]{{0, 1}, {0, 3}, {1, 0},
                {1, 2}, {2, 1}, {2, 3},
                {3, 0}, {3, 2}});
        assertTrue(graph.isTwoGraph());

        graph = new Graph(4,
                new int[][]{{0, 1}, {0, 3}, {1, 0},
                {1, 2}, {1, 3}, {2, 1},
                {2, 3}, {3, 0}, {3, 1}, {3, 2}});
        assertFalse(graph.isTwoGraph());
    }

}
import List.Queue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestListQueue {
    Queue queue, queue2;

    @Before
    public void setUp() {
        queue = new Queue();
    }

    @Test
    public void testQueue(){
        Queue q1 = new Queue();
        q1.insertArray(new int[]{1, 2});
        Queue q2 = new Queue();
        q2.insertArray(new int[]{4, 5});
        Queue[] q = new Queue[]{q1, q2};
        queue = new Queue(q);
        Assert.assertEquals("1 2 4 5", queue.toString());
        q1 = new Queue();
        q1.insertArray(new int[]{1, 2, 3});
        q2 = new Queue();
        q2.insertArray(new int[]{4, 5, 6});
        q = new Queue[]{q1, q2};
        queue = new Queue(q);
        Assert.assertEquals("1 2 3 4 5 6", queue.toString());
        q1 = new Queue();
        q1.insertArray(new int[]{1, 2, 3});
        q2 = new Queue();
        q2.insertArray(new int[]{4, 5, 6});
        Queue q3 = new Queue();
        q3.insertArray(new int[]{7, 8, 9});
        q = new Queue[]{q1, q2, q3};
        queue = new Queue(q);
        Assert.assertEquals("1 2 3 4 5 6 7 8 9", queue.toString());
        q1 = new Queue();
        q1.insertArray(new int[]{1});
        q2 = new Queue();
        q2.insertArray(new int[]{4});
        q3 = new Queue();
        q3.insertArray(new int[]{7});
        Queue q4 = new Queue();
        q4.insertArray(new int[]{10});
        q = new Queue[]{q1, q2, q3, q4};
        queue = new Queue(q);
        Assert.assertEquals("1 4 7 10", queue.toString());
    }

    @Test
    public void testDequeue(){
        queue.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        assertEquals(1, queue.dequeue(1).getData());
        assertEquals(4, queue.dequeue(3).getData());
        assertEquals(10, queue.dequeue(8).getData());
        assertEquals(9, queue.dequeue(7).getData());
        assertEquals(3, queue.dequeue(2).getData());
    }

    @Test
    public void testDivideQueue(){
        queue.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        queue2 = queue.divideQueue();
        assertEquals("1 3 5 7 9", queue.toString());
        assertEquals("2 4 6 8 10", queue2.toString());
        queue2 = queue.divideQueue();
        assertEquals("1 5 9", queue.toString());
        assertEquals("3 7", queue2.toString());
        queue2 = queue.divideQueue();
        assertEquals("1 9", queue.toString());
        assertEquals("5", queue2.toString());
        queue2 = queue.divideQueue();
        assertEquals("1", queue.toString());
        assertEquals("9", queue2.toString());
    }

    @Test
    public void testDivideQueue2(){
        queue.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        Queue[] q = queue.divideQueue(2);
        assertEquals("1 3 5 7 9 11", q[0].toString());
        assertEquals("2 4 6 8 10 12", q[1].toString());
        q = queue.divideQueue(3);
        assertEquals("1 4 7 10", q[0].toString());
        assertEquals("2 5 8 11", q[1].toString());
        assertEquals("3 6 9 12", q[2].toString());
        q = queue.divideQueue(4);
        assertEquals("1 5 9", q[0].toString());
        assertEquals("2 6 10", q[1].toString());
        assertEquals("3 7 11", q[2].toString());
        assertEquals("4 8 12", q[3].toString());
    }

    @Test
    public void testMinimum(){
        queue.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        assertEquals(1, queue.minimum());
        queue = new Queue();
        queue.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        assertEquals(0, queue.minimum());
        queue = new Queue();
        queue.insertArray(new int[]{1, 2, 3, 4, 5, 6, -1, 7, 8, 9, 0});
        assertEquals(-1, queue.minimum());
        queue = new Queue();
        queue.insertArray(new int[]{1, 2, -3, 4, 5, 6, -1, 7, 8, 9, 0});
        assertEquals(-3, queue.minimum());
    }

    @Test
    public void testMaximum(){
        queue.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        assertEquals(10, queue.maximum());
        queue = new Queue();
        queue.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        assertEquals(9, queue.maximum());
        queue = new Queue();
        queue.insertArray(new int[]{1, 2, 3, 4, 5, 6, 12, 7, 8, 9, 0});
        assertEquals(12, queue.maximum());
        queue = new Queue();
        queue.insertArray(new int[]{1, 2, 13, 4, 5, 6, 12, 7, 8, 9, 0});
        assertEquals(13, queue.maximum());
    }

    @Test
    public void testRemoveAll(){
        Queue q1 = new Queue();
        q1.insertArray(new int[]{1, 2});
        Queue q2 = new Queue();
        q2.insertArray(new int[]{4, 5});
        Queue[] q = new Queue[]{q1, q2};
        queue.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        queue.removeAll(q);
        Assert.assertEquals("3 6 7 8 9 10", queue.toString());
        q1 = new Queue();
        q1.insertArray(new int[]{1, 2, 3});
        q2 = new Queue();
        q2.insertArray(new int[]{4, 5, 6});
        q = new Queue[]{q1, q2};
        queue = new Queue();
        queue.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        queue.removeAll(q);
        Assert.assertEquals("7 8 9 10", queue.toString());
        q1 = new Queue();
        q1.insertArray(new int[]{1, 2, 3});
        q2 = new Queue();
        q2.insertArray(new int[]{4, 5, 6});
        Queue q3 = new Queue();
        q3.insertArray(new int[]{7, 8, 9});
        q = new Queue[]{q1, q2, q3};
        queue = new Queue();
        queue.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        queue.removeAll(q);
        Assert.assertEquals("10", queue.toString());
        q1 = new Queue();
        q1.insertArray(new int[]{1});
        q2 = new Queue();
        q2.insertArray(new int[]{4});
        q3 = new Queue();
        q3.insertArray(new int[]{7});
        Queue q4 = new Queue();
        q4.insertArray(new int[]{10});
        q = new Queue[]{q1, q2, q3, q4};
        queue = new Queue();
        queue.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        queue.removeAll(q);
        Assert.assertEquals("2 3 5 6 8 9", queue.toString());
    }

    @Test
    public void testReverseQueue(){
        queue.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        queue.reverseQueue();
        assertEquals("10 9 8 7 6 5 4 3 2 1", queue.toString());
        queue = new Queue();
        queue.insertArray(new int[]{5});
        queue.reverseQueue();
        assertEquals("5", queue.toString());
        queue = new Queue();
        queue.insertArray(new int[]{4, 5, 3});
        queue.reverseQueue();
        assertEquals("3 5 4", queue.toString());
        queue = new Queue();
        queue.insertArray(new int[]{1, 4, 5, 4, 1});
        queue.reverseQueue();
        assertEquals("1 4 5 4 1", queue.toString());
    }

    @Test
    public void testThisMustChangeMartinNiemoller(){
        queue.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        int[] sosyalistler = new int[]{0, 2, 4, 6, 8, 10};
        queue.thisMustChange(sosyalistler);
        assertEquals("2 4 6 8 10 12 1 3 5 7 9 11", queue.toString());
        int[] sendikacilar = new int[]{0, 3, 5};
        queue.thisMustChange(sendikacilar);
        assertEquals("4 6 10 1 3 5 7 9 11 2 8 12", queue.toString());
        int[] yahudiler = new int[]{0, 1};
        queue.thisMustChange(yahudiler);
        assertEquals("ben 1 3 5 7 9 11 2 8 12 4 6", queue.toString());
    }

    @Test
    public void testSecondMaximum() {
        Queue q1 = new Queue();
        q1.insertArray(new int[]{1, 2});
        assertEquals(1, q1.secondMaximum());
        Queue q2 = new Queue();
        q2.insertArray(new int[]{5, 6, 1, 2});
        assertEquals(5, q2.secondMaximum());
        Queue q3 = new Queue();
        q3.insertArray(new int[]{-6, -7, -8});
        assertEquals(-7, q3.secondMaximum());
        Queue q4 = new Queue();
        q4.insertArray(new int[]{10, 15, 20, 18});
        assertEquals(18, q4.secondMaximum());
    }

}

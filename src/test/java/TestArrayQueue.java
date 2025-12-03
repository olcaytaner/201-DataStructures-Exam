import Array.Queue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestArrayQueue {
    Queue queue, queue2;

    @Before
    public void setUp() {
        queue = new Queue(100);
    }

    @Test
    public void testQueue(){
        Queue q1 = new Queue(100);
        q1.insertArray(new int[]{1, 2});
        Queue q2 = new Queue(100);
        q2.insertArray(new int[]{4, 5});
        Queue[] q = new Queue[]{q1, q2};
        queue = new Queue(q);
        Assert.assertEquals("1 4 2 5", queue.toString());
        q1 = new Queue(100);
        q1.insertArray(new int[]{1, 2, 3});
        q2 = new Queue(100);
        q2.insertArray(new int[]{4, 5, 6});
        q = new Queue[]{q1, q2};
        queue = new Queue(q);
        Assert.assertEquals("1 4 2 5 3 6", queue.toString());
        q1 = new Queue(100);
        q1.insertArray(new int[]{1, 2, 3});
        q2 = new Queue(100);
        q2.insertArray(new int[]{4, 5, 6});
        Queue q3 = new Queue(100);
        q3.insertArray(new int[]{7, 8, 9});
        q = new Queue[]{q1, q2, q3};
        queue = new Queue(q);
        Assert.assertEquals("1 4 7 2 5 8 3 6 9", queue.toString());
        q1 = new Queue(100);
        q1.insertArray(new int[]{1});
        q2 = new Queue(100);
        q2.insertArray(new int[]{4});
        q3 = new Queue(100);
        q3.insertArray(new int[]{7});
        Queue q4 = new Queue(100);
        q4.insertArray(new int[]{10});
        q = new Queue[]{q1, q2, q3, q4};
        queue = new Queue(q);
        Assert.assertEquals("1 4 7 10", queue.toString());
    }

    @Test
    public void testCopyPaste(){
        queue.insertArray(new int[]{1, 2, 3, 4, 5});
        queue2 = new Queue(100);
        queue2.insertArray(new int[]{6, 7, 8});
        queue.copyPaste(queue2, 0);
        assertEquals("6 7 8 1 2 3 4 5", queue.toString());
        queue = new Queue(100);
        queue.insertArray(new int[]{1, 2, 3, 4, 5});
        queue2 = new Queue(100);
        queue2.insertArray(new int[]{6, 7, 8, 9});
        queue.copyPaste(queue2, 5);
        assertEquals("1 2 3 4 5 6 7 8 9", queue.toString());
        queue = new Queue(100);
        queue.insertArray(new int[]{1, 2, 3, 4, 5});
        queue2 = new Queue(100);
        queue2.insertArray(new int[]{6, 7, 8, 9, 10});
        queue.copyPaste(queue2, 3);
        assertEquals("1 2 3 6 7 8 9 10 4 5", queue.toString());
        queue = new Queue(100);
        queue.insertArray(new int[]{1, 2, 3, 4, 5});
        queue2 = new Queue(100);
        queue2.insertArray(new int[]{6});
        queue.copyPaste(queue2, 1);
        assertEquals("1 6 2 3 4 5", queue.toString());
    }

    @Test
    public void testCutPaste(){
        queue.insertArray(new int[]{1, 2, 3, 4, 5});
        queue2 = new Queue(100);
        queue2.insertArray(new int[]{6, 7, 8});
        queue.cutPaste(queue2, 0, 2);
        assertEquals("6 7 8 1 2 3", queue2.toString());
        assertEquals("4 5", queue.toString());
        queue = new Queue(100);
        queue.insertArray(new int[]{1, 2, 3, 4, 5});
        queue2 = new Queue(100);
        queue2.insertArray(new int[]{6, 7, 8, 9});
        queue.cutPaste(queue2, 2, 3);
        assertEquals("6 7 8 9 3 4", queue2.toString());
        assertEquals("1 2 5", queue.toString());
        queue = new Queue(100);
        queue.insertArray(new int[]{1, 2, 3, 4, 5});
        queue2 = new Queue(100);
        queue2.insertArray(new int[]{6, 7, 8, 9, 10});
        queue.cutPaste(queue2, 0, 4);
        assertEquals("6 7 8 9 10 1 2 3 4 5", queue2.toString());
        assertEquals("", queue.toString());
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
    public void testDequeue2nd(){
        queue.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        assertEquals(2, queue.dequeue2nd().getData());
        assertEquals(3, queue.dequeue2nd().getData());
        assertEquals(4, queue.dequeue2nd().getData());
        assertEquals(5, queue.dequeue2nd().getData());
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
    public void testInsertAfterLargest(){
        queue.insertArray(new int[]{1, 2, 3, 4, 5});
        queue.insertAfterLargest(2);
        assertEquals("1 2 3 4 5 2", queue.toString());
        queue = new Queue(100);
        queue.insertArray(new int[]{5, 4, 3});
        queue.insertAfterLargest(6);
        assertEquals("5 6 4 3", queue.toString());
        queue = new Queue(100);
        queue.insertArray(new int[]{5});
        queue.insertAfterLargest(1);
        assertEquals("5 1", queue.toString());
    }

    @Test
    public void testRemoveOddIndexed(){
        queue.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        queue.removeOddIndexed();
        assertEquals("2 4 6 8 10", queue.toString());
        queue.removeOddIndexed();
        assertEquals("4 8", queue.toString());
        queue.removeOddIndexed();
        assertEquals("8", queue.toString());
    }
    
    @Test
    public void testRotateQueue(){
        queue.insertArray(new int[]{1, 2, 3, 4, 5});
        queue.rotateQueue(2);
        assertEquals("3 4 5 1 2", queue.toString());
        queue = new Queue(100);
        queue.insertArray(new int[]{1, 2, 3, 4, 5, 6});
        queue.rotateQueue(5);
        assertEquals("6 1 2 3 4 5", queue.toString());
        queue = new Queue(100);
        queue.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        queue.rotateQueue(1);
        assertEquals("2 3 4 5 6 7 1", queue.toString());
        queue = new Queue(100);
        queue.insertArray(new int[]{4, 5, 6, 7, 8});
        queue.rotateQueue(3);
        assertEquals("7 8 4 5 6", queue.toString());
    }

    @Test
    public void testQueueZigZag() {
        Queue q1 = new Queue(10);
        Queue q2 = new Queue(10);
        Queue q3 = new Queue(10);
        Queue q4 = new Queue(10);
        q1.insertArray(new int[]{1, 2, 7, 9});
        q2.insertArray(new int[]{2, 6, 3, 4});
        q3.insertArray(new int[]{7, 8, 5, 7});
        q4.insertArray(new int[]{9, 0, 8, 8});
        Queue[] arr1 = new Queue[]{q1,q2,q3,q4};
        Queue main = Queue.QueueZigZag(arr1);
        assertEquals("1 2 7 9 9 4 7 8 2 6 8 0 7 3 5 8", main.toString());
        Queue q5 = new Queue(10);
        Queue q6 = new Queue(10);
        Queue q7 = new Queue(10);
        Queue q8 = new Queue(10);
        q5.insertArray(new int[]{1, 2});
        q6.insertArray(new int[]{2, 6});
        q7.insertArray(new int[]{7, 8});
        q8.insertArray(new int[]{9, 0});
        Queue[] arr2 = new Queue[]{q5,q6,q7,q8};
        Queue main2 = Queue.QueueZigZag(arr2);
        assertEquals("1 2 7 9 2 6 8 0", main2.toString());
    }

}
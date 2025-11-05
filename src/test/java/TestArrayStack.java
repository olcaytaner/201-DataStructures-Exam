import Array.Stack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestArrayStack {

    Stack stack, stack2;

    @Before
    public void setup(){
        stack = new Stack(100);
    }

    @Test
    public void testCheckString(){
        assertTrue(stack.checkString(new int[]{1, 1, 1, 1, 1, 2, 2, 2, 2, 2}));
        assertTrue(stack.checkString(new int[]{1, 2}));
        assertTrue(stack.checkString(new int[]{1, 1, 2, 2}));
        assertFalse(stack.checkString(new int[]{1, 1, 1, 1, 2, 2, 2, 2, 2}));
        assertFalse(stack.checkString(new int[]{1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}));
        assertFalse(stack.checkString(new int[]{1, 1, 1, 2}));
        assertFalse(stack.checkString(new int[]{2, 1}));
    }

    @Test
    public void testCompress(){
        stack.insertArray(new int[]{1, 1, 1, 1, 1, 2, 2, 2, 2, 2});
        stack.compress();
        assertEquals("1 2", stack.toString());
        stack = new Stack(100);
        stack.insertArray(new int[]{1, 2, 3, 4, 5});
        stack.compress();
        assertEquals("1 2 3 4 5", stack.toString());
        stack = new Stack(100);
        stack.insertArray(new int[]{1, 1, 2, 2, 2, 5, 5, 5, 5, 6});
        stack.compress();
        assertEquals("1 2 5 6", stack.toString());
        stack = new Stack(100);
        stack.insertArray(new int[]{1, 4, 4, 8, 8, 8, 16, 16, 16, 16, 32});
        stack.compress();
        assertEquals("1 4 8 16 32", stack.toString());
    }

    @Test
    public void testCopyPaste(){
        stack.insertArray(new int[]{1, 2, 3, 4, 5});
        stack2 = new Stack(100);
        stack2.insertArray(new int[]{6, 7, 8});
        stack.copyPaste(stack2, 0);
        assertEquals("6 7 8 1 2 3 4 5", stack.toString());
        stack = new Stack(100);
        stack.insertArray(new int[]{1, 2, 3, 4, 5});
        stack2 = new Stack(100);
        stack2.insertArray(new int[]{6, 7, 8, 9});
        stack.copyPaste(stack2, 5);
        assertEquals("1 2 3 4 5 6 7 8 9", stack.toString());
        stack = new Stack(100);
        stack.insertArray(new int[]{1, 2, 3, 4, 5});
        stack2 = new Stack(100);
        stack2.insertArray(new int[]{6, 7, 8, 9, 10});
        stack.copyPaste(stack2, 3);
        assertEquals("1 2 3 6 7 8 9 10 4 5", stack.toString());
        stack = new Stack(100);
        stack.insertArray(new int[]{1, 2, 3, 4, 5});
        stack2 = new Stack(100);
        stack2.insertArray(new int[]{6});
        stack.copyPaste(stack2, 1);
        assertEquals("1 6 2 3 4 5", stack.toString());
    }

    @Test
    public void testInsertAfterLargest(){
        stack.insertArray(new int[]{1, 2, 3, 4, 5});
        stack.insertAfterLargest(0);
        assertEquals("1 2 3 4 5 0", stack.toString());
        stack = new Stack(100);
        stack.insertArray(new int[]{5, 4, 3, 2});
        stack.insertAfterLargest(1);
        assertEquals("5 1 4 3 2", stack.toString());
        stack = new Stack(100);
        stack.insertArray(new int[]{4});
        stack.insertAfterLargest(2);
        assertEquals("4 2", stack.toString());
        stack = new Stack(100);
        stack.insertArray(new int[]{2, 10, 5, 3, 15, 4, 1});
        stack.insertAfterLargest(15);
        assertEquals("2 10 5 3 15 15 4 1", stack.toString());
    }

    @Test
    public void testIsBalanced(){
        assertTrue(Stack.isBalanced(new int[]{2, 3, 13, 12, 4, 14}));
        assertFalse(Stack.isBalanced(new int[]{5, 15, 4, 3, 14, 13}));
        assertTrue(Stack.isBalanced(new int[]{5, 15, 4, 14, 3, 13, 6, 16}));
        assertFalse(Stack.isBalanced(new int[]{15, 5}));
        assertTrue(Stack.isBalanced(new int[]{5, 15}));
    }

    @Test
    public void testPop(){
        stack.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        assertEquals(10, stack.pop(1).getData());
        assertEquals(7, stack.pop(3).getData());
        assertEquals(1, stack.pop(8).getData());
        assertEquals(2, stack.pop(7).getData());
        assertEquals(8, stack.pop(2).getData());
    }

    @Test
    public void testPush(){
        stack.insertArray(new int[]{1, 2, 3, 4, 5});
        stack.push(1, 6);
        assertEquals("1 2 3 4 5 6", stack.toString());
        stack.push(2, 8);
        assertEquals("1 2 3 4 5 8 6", stack.toString());
        stack.push(7, 0);
        assertEquals("1 0 2 3 4 5 8 6", stack.toString());
        stack.push(9, 10);
        assertEquals("10 1 0 2 3 4 5 8 6", stack.toString());
    }

    @Test
    public void testRemoveEvenIndexed(){
        stack.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        stack.removeEvenIndexed();
        assertEquals("1 3 5 7 9", stack.toString());
        stack.removeEvenIndexed();
        assertEquals("1 5 9", stack.toString());
        stack.removeEvenIndexed();
        assertEquals("1 9", stack.toString());
        stack.removeEvenIndexed();
        assertEquals("1", stack.toString());
    }

    @Test
    public void testRemoveBetweenMinMax(){
        stack.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        stack.removeBetweenMinMax();
        assertEquals("1 10", stack.toString());
        stack = new Stack(100);
        stack.insertArray(new int[]{6, 8, 9, 3, 2, 1, 5, 7});
        stack.removeBetweenMinMax();
        assertEquals("6 8 9 1 5 7", stack.toString());
        stack = new Stack(100);
        stack.insertArray(new int[]{10, 9, 8, 7, 6, 5, 1, 4, 3, 2});
        stack.removeBetweenMinMax();
        assertEquals("10 1 4 3 2", stack.toString());
        stack = new Stack(100);
        stack.insertArray(new int[]{5, 3, 7, 1, 8, 2, 10});
        stack.removeBetweenMinMax();
        assertEquals("5 3 7 1 10", stack.toString());
    }

}

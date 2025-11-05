import List.LinkedList;
import List.Stack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestListStack {

    Stack stack, stack2;

    @Before
    public void setup(){
        stack = new Stack();
    }

    @Test
    public void testStack() {
        stack2 =  new Stack();
        stack2.insertArray(new  int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        stack = new Stack(stack2, 0, 0);
        assertEquals("9", stack.toString());
        stack = new Stack(stack2, 0, 8);
        assertEquals("1 2 3 4 5 6 7 8 9", stack.toString());
        stack = new Stack(stack2, 3, 5);
        assertEquals("4 5 6", stack.toString());
        stack = new Stack(stack2, 1, 6);
        assertEquals("3 4 5 6 7 8", stack.toString());
    }

    @Test
    public void testAddToStack(){
        stack2 =  new Stack();
        stack2.insertArray(new  int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        stack.addToStack(stack2, 1, 1);
        assertEquals("9", stack.toString());
        stack = new Stack();
        stack.addToStack(stack2, 1, 9);
        assertEquals("9 8 7 6 5 4 3 2 1", stack.toString());
        stack = new Stack();
        stack.addToStack(stack2, 3, 5);
        assertEquals("7 6 5", stack.toString());
        stack = new Stack();
        stack.addToStack(stack2, 2, 6);
        assertEquals("8 7 6 5 4", stack.toString());
    }

    @Test
    public void testCheckString(){
        assertTrue(stack.checkString(new int[]{1, 2, 3, 4}));
        assertTrue(stack.checkString(new int[]{1, 1, 2, 2, 2, 3, 3, 3, 4, 4}));
        assertTrue(stack.checkString(new int[]{1, 1, 1, 2, 3, 4, 4, 4}));
        assertFalse(stack.checkString(new int[]{1, 2, 3, 4, 4}));
        assertFalse(stack.checkString(new int[]{1, 1, 2, 2, 3, 4, 4}));
        assertTrue(stack.checkString(new int[]{1, 2, 2, 3, 3, 4}));
        assertFalse(stack.checkString(new int[]{1, 1, 1, 2, 2, 3, 4, 4, 4}));
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
    public void testPopBottomK(){
        stack.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        LinkedList list = stack.popBottomK(1);
        assertEquals("1", list.toString());
        list = stack.popBottomK(3);
        assertEquals("2 3 4", list.toString());
        stack = new Stack();
        stack.insertArray(new int[]{1});
        list = stack.popBottomK(1);
        assertEquals("1", list.toString());
        stack = new Stack();
        stack.insertArray(new int[]{1, 2, 3, 4, 5});
        list = stack.popBottomK(3);
        assertEquals("1 2 3", list.toString());
    }

    @Test
    public void testRemoveBottomK(){
        stack.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        stack.removeBottomK(1);
        assertEquals("2 3 4 5 6 7 8 9 10", stack.toString());
        stack.removeBottomK(3);
        assertEquals("5 6 7 8 9 10", stack.toString());
        stack = new Stack();
        stack.insertArray(new int[]{1});
        stack.removeBottomK(1);
        assertEquals("", stack.toString());
        stack = new Stack();
        stack.insertArray(new int[]{1, 2, 3, 4, 5});
        stack.removeBottomK(3);
        assertEquals("4 5", stack.toString());
    }

    @Test
    public void testRemoveOddIndexed(){
        stack.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        stack.removeOddIndexed();
        assertEquals("2 4 6 8 10 12", stack.toString());
        stack.removeOddIndexed();
        assertEquals("4 8 12", stack.toString());
        stack.removeOddIndexed();
        assertEquals("8", stack.toString());
        stack.removeOddIndexed();
        assertEquals("", stack.toString());
    }

    @Test
    public void testRotateStack(){
        stack.insertArray(new int[]{1, 2, 3, 4, 5});
        stack.rotateStack(2);
        assertEquals("4 5 1 2 3", stack.toString());
        stack = new Stack();
        stack.insertArray(new int[]{1, 2, 3, 4, 5, 6});
        stack.rotateStack(5);
        assertEquals("2 3 4 5 6 1", stack.toString());
        stack = new Stack();
        stack.insertArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        stack.rotateStack(1);
        assertEquals("7 1 2 3 4 5 6", stack.toString());
        stack = new Stack();
        stack.insertArray(new int[]{4, 5, 6, 7, 8});
        stack.rotateStack(3);
        assertEquals("6 7 8 4 5", stack.toString());
    }

}

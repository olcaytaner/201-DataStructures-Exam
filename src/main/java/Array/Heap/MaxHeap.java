package Array.Heap;

public class MaxHeap extends Heap{

    public MaxHeap(int N) {
        super(N);
    }

    protected void percolateDown(int no){
        int left, right;
        left = 2 * no + 1;
        right = 2 * no + 2;
        while ((left < count && array[no].getData() < array[left].getData()) ||
                (right < count && array[no].getData() < array[right].getData())){
            if (right >= count || array[left].getData() > array[right].getData()){
                swapNode(no, left);
                no = left;
            } else {
                swapNode(no, right);
                no = right;
            }
            left = 2 * no + 1;
            right = 2 * no + 2;
        }
    }

    protected void percolateUp(int no){
        int parent;
        parent = (no - 1) / 2;
        while (parent >= 0 && array[parent].getData() < array[no].getData()){
            swapNode(parent, no);
            no = parent;
            parent = (no - 1) / 2;
        }
    }

    public void update(int k, int newValue){
        int oldValue = array[k].getData();
        array[k].setData(newValue);
        if (oldValue > newValue){
            percolateDown(k);
        } else {
            percolateUp(k);
        }
    }

    /**
     * Given the index of a heap node in a binary max heap, write the method in {\bf MaxHeap} class that returns the
     * indexes of its ascendants (parent, grandparent, grandgrandparent, $\ldots$) of this node. The array should contain
     * only that many items not more not less.
     */
    public int[] ascendants(int index){
        return null;
    }

    /**
     * Given the index of a heap node in a max-heap, write a method that determines if the subtree rooted from the node
     * with index satisfies the heap-order property. Do not use any class or external methods.
     */
    public boolean heapOrder(int index){
        return false;
    }

    /**
     * Write the method in {\bf MaxHeap} class that returns the shortest distance between two nodes in the heap with
     * indexes index1 and index2. Generate the ascendant lists of the nodes with index1 and index2 (You can assume the
     * tree depth is smaller than 100). Compare those lists to solve the problem.
     */
    public int shortestDistanceBetWeenNodes(int index1, int index2){
        return 0;
    }

    /**
     * Write the method in MaxHeap class that returns the third maximum number in the heap. Your method should run in
     * {\cal O}(1) time. You are not allowed to use any class method except getData.
     */
    public int third(){
        return 0;
    }

}

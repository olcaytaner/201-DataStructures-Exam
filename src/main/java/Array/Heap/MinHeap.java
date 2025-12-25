package Array.Heap;

public class MinHeap extends Heap{

    public MinHeap(int N) {
        super(N);
    }

    protected void percolateDown(int no){
        int left, right;
        left = 2 * no + 1;
        right = 2 * no + 2;
        while ((left < count && array[no].getData() > array[left].getData()) ||
                (right < count && array[no].getData() > array[right].getData())){
            if (right >= count || array[left].getData() < array[right].getData()){
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
        while (parent >= 0 && array[parent].getData() > array[no].getData()){
            swapNode(parent, no);
            no = parent;
            parent = (no - 1) / 2;
        }
    }

    public void update(int k, int newValue){
        int oldValue = array[k].getData();
        array[k].setData(newValue);
        if (oldValue < newValue){
            percolateDown(k);
        } else {
            percolateUp(k);
        }
    }

    /**
     * Write the method in {\bf MinHeap} class that returns the number of nodes in the heap whose children can be
     * swapped without hurting the heap property. Your method should run in ${\cal O}(N)$ time.
     */
    public int howManyChildrenCanBeSwapped(){
        return 0;
    }

    /**
     * Write the method in {\bf MinHeap} class which returns true if the largest value appears on the leftmost node. You
     * may not use any additional data structures.
     */
    public boolean isLargestLeftMost(){
        return false;
    }

    /**
     * Given an array of N integers, find the $k$'th maximum of those integers in $\cal O$$(N\log K)$ time. (Hint: Use
     * a min-heap to store $K$ largest elements at a time, in that case the removeMin will return the $k$'th maximum).
     */
    public static int kthMaximum(int[] array, int k){
        return 0;
    }

    /**
     Write a method in {\bf MinHeap} class that returns the average number of percolate up operations for numbers given in the
     list, if each number is assumed to be inserted independently to the heap. Do not modify the heap while checking.
     */
    public double averagePercolateUp(int[] list) { return 0; }

}

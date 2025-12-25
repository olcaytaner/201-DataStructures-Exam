package Array.Heap;

public class MaxDHeap extends DHeap {

    public MaxDHeap(int N, int d) {
        super(N, d);
    }

    protected void percolateDown(int no){
        int child, largestChild;
        int value;
        do{
            largestChild = -1;
            value = array[no].getData();
            for (int i = 1; i <= d && d * no + i < count; i++){
                child = d * no + i;
                if (value < array[child].getData()){
                    largestChild = child;
                    value = array[child].getData();
                }
            }
            if (largestChild != -1){
                swapNode(no, largestChild);
                no = largestChild;
            } else {
                break;
            }
        } while (true);
    }
    protected void percolateUp(int no){
        int parent;
        parent = (no - 1) / d;
        while (parent >= 0 && array[parent].getData() < array[no].getData()){
            swapNode(parent, no);
            no = parent;
            parent = (no - 1) / d;
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
     * Given the index of a d-heap node, write a method that returns the number of descendants (children, grandchildren,
     * grandgrandchildren, etc.) of that heap node. Do not use any class or external methods.
     */
    public int descendants(int no){
        return 0;
    }

    /**
     * Given index of a d-heap node and a level $l$, write a recursive function that returns the number of descendants
     * at level $l$ of that heap node. Level 1 corresponds to children, Level 2 corresponds grandchildren, Level 3
     * corresponds grand grand children of that heap node.
     */
    public int descendantsLevel(int no, int level){
        return 0;
    }

    /**
     * Write a recursive method in {\bf MaxDHeap} class which fills the descendants of the HeapNode with index
     * {\em current} to the array list. Use and modify index to store the HeapNodes into correct positions. Your method
     * should run in ${\cal O}(N)$ time.
     */
    public int[] descendantsArray(int current){
        return null;
    }

    /**
     * Write the method in {\bf MaxDHeap} class that returns the number of node pairs in the heap which can be swapped
     * without hurting the heap property. Your method should run in $O(N^2)$ time. You may not use any additional data
     * structures.
     */
    public int howManyPairCanBeSwapped(){
        return 0;
    }

    /**
     * Write the method in {\bf MaxDHeap} class that returns the third maximum number in the heap. Your method should
     * run in ${\cal O}(d^2)$ time.
     */
    public int third(){
        return 0;
    }

    /**
     Write the method in {\bf MaxDHeap} class that finds the second minimum item. You may not use any additional data
     structures. You may assume there are more than 2 items in the heap. You should not use more than N comparisons (Sum of ifs else
     ifs elses is at most N).
     */
    public int secondMinimum() { return 0;}
}

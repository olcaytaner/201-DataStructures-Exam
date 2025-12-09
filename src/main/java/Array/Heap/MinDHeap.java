package Array.Heap;

public class MinDHeap extends DHeap {

    public MinDHeap(int N, int d) {
        super(N, d);
    }

    protected void percolateDown(int no){
        int child, smallestChild;
        int value;
        do{
            smallestChild = -1;
            value = array[no].getData();
            for (int i = 1; i <= d && d * no + i < count; i++){
                child = d * no + i;
                if (value > array[child].getData()){
                    smallestChild = child;
                    value = array[child].getData();
                }
            }
            if (smallestChild != -1){
                swapNode(no, smallestChild);
                no = smallestChild;
            } else {
                break;
            }
        } while (true);
    }
    protected void percolateUp(int no){
        int parent;
        parent = (no - 1) / d;
        while (parent >= 0 && array[parent].getData() > array[no].getData()){
            swapNode(parent, no);
            no = parent;
            parent = (no - 1) / d;
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
     * Write a recursive method in {\bf MinDHeap} class which fills the ascendants (including also current) of the
     * HeapNode with index {\em current} to the array list. Use and modify index to store the HeapNodes into correct
     * positions. Your method should run in ${\cal O}(\log N)$ time. You are not allowed to use any class method.
     */
    public int[] ascendants(int current){
        return null;
    }

    /**
     * Write the method in {\bf MinDHeap} class that finds the number of places in the heap, which can be replaced with
     * the given value key.
     */
    public int numberOfPlacesToReplace(int key){
        return 0;
    }

    /**
     * Write the method in {\bf MinDHeap} class that returns the sum of the lengths of the change intervals of each
     * node. A change interval of a node $N$ is defined with the minimum and maximum values that can be attained by $N$
     * without changing any other node. For root node, take the minimum as $min$. For leaf nodes, take the maximum as
     * $max$.
     */
    public int sumOfMaxChange(int min, int max){
        return 0;
    }
}

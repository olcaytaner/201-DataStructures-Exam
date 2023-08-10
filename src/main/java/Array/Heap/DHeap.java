package Array.Heap;

public abstract class DHeap extends Heap {

    protected int d;

    public DHeap(int N, int d){
        super(N);
        this.d = d;
    }

}

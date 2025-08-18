package List;

public class Hash {

    private LinkedList[] table;

    private int N;

    public Hash(int N){
        table = new LinkedList[N];
        for (int i = 0; i < N; i++){
            table[i] = new LinkedList();
        }
        this.N = N;
    }

    public Node search(int value){
        int address;
        address = hashFunction(value);
        return table[address].search(value);
    }

    public void insert(int value){
        int address;
        address = hashFunction(value);
        table[address].insertFirst(new Node(value));
    }

    private int hashFunction(int value){
        return value % N;
    }

    void deleteAll(int X){
    }

    public static int[] difference(int[] list1, int[] list2){
        return null;
    }

    int[] intersection(int[] list1, int[] list2){
        return null;
    }

    boolean isValid(){
        return false;
    }

    public int minTableSize(int[] numbers){
        return 0;
    }

    int numberOfClusters(){
        return 0;
    }

    boolean perfectMap(){
        return false;
    }

    Hash simplify(){
        return null;
    }

    public static boolean sumOfFourK(int[] array, int K){
        return false;
    }

    boolean sumOfTwoK(int[] array, int k){
        return false;
    }

    public int[] symmetricDiff(int[] list1, int[] list2){
        return null;
    }

    public static int[] union(int[] list1, int[] list2){
        return null;
    }

}

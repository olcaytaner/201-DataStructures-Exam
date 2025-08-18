package Array;

public class Hash {

    private Element[] table;

    private boolean[] deleted;

    private int N;

    public Hash(int N){
        table = new Element[N];
        deleted = new boolean[N];
        this.N = N;
    }

    private int hashFunction(int value){
        return value % N;
    }

    public Element search(int value){
        int address;
        address = hashFunction(value);
        while (table[address] != null){
            if (!deleted[address] && table[address].getData() == value){
                break;
            }
            address = (address + 1) % N;
        }
        return table[address];
    }
    public void insert(int value){
        int address;
        address = hashFunction(value);
        while (table[address] != null && !deleted[address]){
            address = (address + 1) % N;
        }
        if (table[address] != null){
            deleted[address] = false;
        }
        table[address] = new Element(value);
    }

    boolean anyDuplicate(int[] array){
        return false;
    }

    void deleteAll(int X){

    }

    public static boolean equalPairSums(int[] array){
        return false;
    }

    int hashFunctionItSelf(){
        return 0;
    }

    int numberOfExtras(int[] array){
        return 0;
    }

    Hash simplify(){
        return null;
    }

    static int[] sortByHashing(int[] array){
        return null;
    }

}

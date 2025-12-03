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

    public void insertArray(int[] data){
        for (int datum : data){
            insert(datum);
        }
    }

    private int hashFunction(int value){
        return value % N;
    }

    public String toString(){
        String s = "";
        for (int i = 0; i < N; i++){
            if (!table[i].isEmpty()){
                s += table[i].toString() + " ";
            }
        }
        return s.trim();
    }

    /**
     * Write a method that deletes all elements having value {\em X}. Assume also that {\em X} can exist more than once
     * in the hash table. Do not use any class or external methods except hashFunction.
     */
    public void deleteAll(int X){
    }

    /**
     * Write a \textbf{static} method in the Hash class (linked list implementation) to find the difference of the
     * elements in two arrays and return a new array containing all elements from  {$list1$} that are not present in
     * {$list2$}. Your method should run in {$O(N)$} time, where {$N$} is the total number of elements in both arrays.
     * The difference array must contain exactly as many elements as needed (no extra or missing elements). You can use
     * \textbf{at most one} external hash.
     */
    public static int[] difference(int[] list1, int[] list2){
        return null;
    }

    /**
     * Write the static method to find the intersection of the elements in two arrays and return a new array. Your
     * method should run in ${\cal O}(N)$ time, where $N$ is the number of elements in the arrays. Do not use any
     * external data structures or arrays except the resulting array and hash table. The intersection array should
     * contain only that many items not more not less. Hint: How can you search an element from the first list in the
     * second list in ${\cal O}(1)$?
     */
    public static int[] intersection(int[] list1, int[] list2){
        return null;
    }

    /**
     * Write the method in Hash class linked list implementation that checks if the hash table is valid or not. An hash
     * table is invalid if it contains the same number twice.  Your method should run in ${\cal O}(N)$ time. Do not use
     * external data structures or hash tables.
     */
    public boolean isValid(){
        return false;
    }

    /**
     * Write the method \lstinline{int minTableSize(int[] numbers)} which identifies the minimum hash table size, where
     * there will be no collisions at all. Use an external linked list based hash table for checking collisions.
     */
    public static int minTableSize(int[] numbers){
        return 0;
    }

    /**
     * Write a method that returns true if the hash table contains one node at maximum per linked list in separate
     * chaining, otherwise it returns false.
     */
    public boolean perfectMap(){
        return false;
    }

    /**
     * Write a method that simplifies a hash table by creating a new hash table containing elements from the original hash table, where
     * <ol>
     * <item> For single occurrence of a value, copy that value to the new table </item>
     * <item> For multiple occurrences of that value, copy that value only once to the new table </item>
     * </ol>
     */
    public Hash simplify(){
        return null;
    }

    /**
     * Write the static method in Hash class that takes an array of integers as a parameter and returns true if the sum
     * of four elements in the array is K.  Your method should run in $O(N^2)$ time. You are only allowed to use an
     * external array and an external hash table.
     */
    public static boolean sumOfFourK(int[] array, int K){
        return false;
    }

    /**
     * Write the static method in Hash class that takes an array of integers as a parameter and returns true if the sum
     * of two elements in the array is $K$. Your method should run in ${\cal O}(N)$ time. Do not use any external data
     * structures or arrays except the external hash table.
     */
    public static boolean sumOfTwoK(int[] array, int k){
        return false;
    }

    /**
     * Write the static method to find the symmetric difference of the elements in two arrays $(A - B) \cup (B - A)$ and
     * return a new array. The symmetric difference array should contain only that many items not more not
     * less. Your method should run in ${\cal O}(N)$ time, where $N$ is the number of elements in the arrays. Do not use
     * any external data structures or arrays except the resulting array and two external hash tables. Write the method
     * for the array implementation.
     */
    public static int[] symmetricDiff(int[] list1, int[] list2){
        return null;
    }

    /**
     * Write a static method to find the union of the elements in two arrays and return a new array. The union array
     * should contain only that  many items not more not less. Your method should run in O($N$) time, where N is the
     * number of elements in the  arrays. Do not use any external data structures or arrays except the resulting array
     * and an external hash table.
     */
    public static int[] union(int[] list1, int[] list2){
        return null;
    }

    /**
     * Write a static method that takes an array of integers as a parameter and returns true if the
     * sum of three elements in the array is K. Your method should run in
     * $O(N^2)$ time. Do not use any external data structures or arrays except
     * the external hash table.
     */
    public static boolean sumOfThreeK(int[] array, int K){
        return false;
    }
}

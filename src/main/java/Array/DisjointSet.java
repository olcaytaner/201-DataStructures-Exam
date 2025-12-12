package Array;

import List.LinkedList;

public class DisjointSet {
    private Set[] sets;
    private int count;

    public DisjointSet(int count){
        sets = new Set[count];
        for (int i = 0; i < count; i++){
            sets[i] = new Set(i, i);
        }
        this.count = count;
    }

    public DisjointSet(int[] elements, int count){
        sets = new Set[count];
        for (int i = 0; i < count; i++){
            sets[i] = new Set(elements[i], i);
        }
        this.count = count;
    }

    public int findSetRecursive(int index){
        int parent = sets[index].getParent();
        if (parent != index){
            return findSetRecursive(parent);
        }
        return parent;
    }

    public int findSetIterative(int index){
        int parent = sets[index].getParent();
        while (parent != index){
            index = parent;
            parent = sets[index].getParent();
        }
        return parent;
    }

    /**
     * Given in the index of a set as {\em current}, write a recursive method that returns the ascendants (including also
     * current) of that set as an array. You are not allowed to use any class method except getParent.
     */
    int[] ascendants1(int current){
        return null;
    }

    /**
     * Given the index of a set, write a non-recursive function that returns the ancestors (itself, parent, grandparent,
     * etc.). The size of the returning array should be as much as needed.
     */
    int[] ascendants2(int index){
        return null;
    }

    /**
     * You are given a set of equalities such as
     * 0=9
     * 1=2
     * 3=5
     * 5=7
     * 9=4
     * 5=4
     * 6=8
     * where numbers correspond to variables. When the equalities are combined, we get
     * 0=9=4=3=5=7
     * 1=2
     * 6=8
     * 3 equalities. Write the function that finds the number of equalities when combined where $N$ represents the number
     * of variables, left and right represent the left and right parts of the equalities.
     */
    int combine(int N, int[] left, int[] right){
        return 0;
    }

    /**
     * Given in the index of a set as {\em current}, write a recursive method that returns the descendants of that set to
     * the array list.
     */
    int[] descendants1(int current){
        return null;
    }

    /**
     * Given in the index of a set as {\em current}, write a non-recursive method that returns the descendants of that set to
     * the array list.
     */
    int[] descendants2(int current){
        return null;
    }

    /**
     * Write the method which returns the indexes of all sets in the disjoint set where a set with index $index$ is in
     * that set.
     */
    int[] getSetWithIndex(int index){
        return null;
    }

    /**
     * Given the index of a set, write a method that returns the indexes of its grandchildren as a linked list. Do not
     * use any class or external methods.
     */
    LinkedList grandChildren(int index){
        return null;
    }

    /**
     * Write a method that returns true when the given disjoint set is valid, that is from every node $n$, when the
     * ascendants are traversed, no circularity is observed (that is you do not encounter the node $n$ again).
     */
    boolean isValid(){
        return false;
    }


    /**
     * Write the method in {\bf DisjointSet} class that calculates the number of triplet disjoint sets in a disjoint set
     * structure. A disjoint set is a triplet, if the number of sets in that disjoint set is 3. Do not use any class or
     * external methods.
     */
    int numberOfTriplets(){
        return 0;
    }

    /**
     * In an unknown world, there are people (zombie) who bites other people (may or may not be zombie). One is converted
     * to a zombie, if he/she was bitten by some other zombie. Given who bites whom in two arrays, identify the number of
     * survivors, that is the number of people who hasn't been bitten yet. Write the static method where whoBites[i] has
     * bitten whoWasBitten[i] correspondingly. Count represents the number of people in the beginning. Size represents
     * the size of the arrays whoBites and whoWasBitten. You are only allowed to use one external Disjoint Set.
     */
    int numberOfSurvivors(int count, int[] whoBites, int[] whoWasBitten){
        return 0;
    }

    /**
     * Write a function that merges three sets given their indexes. You can use {\em findSet} method, but not the
     * original {\em union} method. Merge the sets such that the resulting merged set will have the minimum depth.
     * Update also the depth if needed.
     */
    void union2(int index1, int index2, int index3){

    }

    /**
     * Write the method that merges $N$ sets given their indexes in the indexList. You should use findSet and the
     * original unionOfSets method. Merge the sets such that the resulting merged set will have the minimum depth. Use
     * an algorithm that sorts the sets according to their depths.
     */
    void unionOfSets(int[] indexList, int N){

    }

    /**
     * Given the index of a set $S$, write a method that unmerges (creates disjoint sets of) it. After unmerging, the
     * direct children of $S$ and $S$ itself will be disjoint sets themselves. You don't need to modify the depths. Do
     * not use any class or external methods.
     */
    void unmerge(int index){

    }

    /**
     * Given the index of a set, write a recursive function that finds the value of that set. The value of a node is 1 +
     * maximum value of its children. Any node with no children has value 1. You are not allowed to use any class method
     * except getParent.
     */
    int value(int index){
        return 0;
    }

}

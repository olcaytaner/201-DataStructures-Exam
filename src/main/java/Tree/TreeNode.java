package Tree;

import List.LinkedList;

public class TreeNode {

    protected TreeNode left;
    protected TreeNode right;
    protected int data;

    public TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public TreeNode getLeft(){
        return left;
    }

    public TreeNode getRight(){
        return right;
    }

    public int getData(){
        return data;
    }

    public void setLeft(TreeNode left){
        this.left = left;
    }

    public void setRight(TreeNode right){
        this.right = right;
    }

    public void prettyPrint(int level){
        for (int i = 0; i < level; i++){
            System.out.print("\t");
        }
        System.out.println(data);
        if (left != null){
            left.prettyPrint(level + 1);
        }
        if (right != null){
            right.prettyPrint(level + 1);
        }
    }

    /**
     * Write the recursive method in TreeNode class which accumulates the contents (integer as data field) of all leaf
     * nodes in queue. For queue, you are only allowed to use enqueue function. You should use array  implementation
     * for the queue in this question.
     */
    public void accumulateLeafNodes(Array.Queue queue){
    }

    /**
     * Write a recursive method which returns true if there is at least one node which is the average of its children
     * (left and right children must exist).
     */
    public boolean averageOfItsChildren(){
        return false;
    }

    /**
     * Write a recursive method in TreeNode class which returns the number of nodes in the tree that satisfy the
     * following property: The node's key is the average of its children (left and right children).
     */
    public int averages(){
        return 0;
    }

    /**
     * Write the recursive method in TreeNode class, which collects all values in all nodes in the tree in a sorted
     * manner. You are not allowed to use any tree methods.
     */
    public int[] collectNodes(){
        return null;
    }

    /**
     * Write a \textbf{recursive} method in TreeNode Class given a binary search tree (BST) and an array of integers
     * representing a potential path. This method should return {$true$} if the sequence of values in the path array
     * matches a valid path from the current node down to a node in the BST, and {$false$} otherwise. Hint: you should
     * create an extra array to forward reduced path to the children.
     */
    public boolean hasPath(int[] path){
        return false;
    }

    /**
     * Write a recursive method , which returns the number of nodes in the binary search tree which have value larger
     * than $X$. Your method should run in ${\cal O}(\log N + K)$ time, where $N$ is total number of nodes and $K$ is
     * the number of nodes which have value larger than $X$ in the tree. Do not use any class or external methods.
     */
    public int higherThanX(int X){
        return 0;
    }

    /**
     * Given a binary tree~(not necessarily search tree), implement a method in TreeNode class to check whether an input
     * binary tree is a mirror of itself (symmetric). You may not use any additional data structure or array.
     */
    public boolean isMirror(TreeNode left, TreeNode right){
        return false;
    }

    /**
     * Write a class method in TreeNode class that returns the number of {\bf leftist} nodes in a binary
     * tree. A node is {\bf leftist} if
     * <ul>
     *     <li>Its left child's data is larger than its right child's data or,</li>
     *     <li>It has only left child.</li>
     * </ul>
     */
    public int leftist(){
        return 0;
    }

    /**
     * Write the recursive method in TreeNode class which collects all values in all nodes in the tree. The size of the
     * array should be as large as it should be. (Hint: First calculate how many items the array should contain, then
     * write the same code to fill in the array. The left and right child function calls should return arrays, and the
     * method should concatenate them)
     */
    public int[] lessThanX(int x){
        return null;
    }

    /**
     * Write a recursive method in TreeNode class that finds the number of duplicate keys in a binary search tree.
     * Assume that if a key is duplicate, it occurs at most twice. Hint: The duplicate of a key is either the maximum
     * number on its left subtree or the minimum number on its right subtree.
     */
    public int numberOfDuplicates(){
        return 0;
    }

    /**
     * Write a recursive method in the {\bf TreeNode} class, which returns the keys on the path in the linked list $l$,
     * where the path is defined by the current parent as follows: If the parent is odd, go left; otherwise go right.
     * Assume that the function is called with an empty linked list for the root node.
     */
    public void pathToLinkedList(LinkedList l){
    }

    /**
     * Write a method that computes the products of all keys in a binary search tree.
     */
    public int productOfTree(){
        return 0;
    }

    /**
     * Write the recursive method in TreeNode class which returns the sum of the keys between p and q in the tree. Your
     * algorithm should run in ${\cal O}(\log N + K)$, where K is the number of nodes which have value larger than p and
     * less than q in the tree.
     */
    public int sumOfNodesBetween(int p, int q){
        return 0;
    }

    /**
     * Write a recursive method in TreeNode class that computes the sum of all keys that are less than $X$ in a binary
     * search tree. You are not allowed to use any tree methods, just attributes, constructors, getters and setters.
     */
    public int sumOfTree(int X){
        return 0;
    }

    /**
     * Write a recursive method which returns the number of nodes which value is greater than its
     * children's average. You may assume left and right children must exist
     * for all non-leaf nodes.
     */
    public int greaterThanChildren(){
        return 0;
    }

    /**
     *  Write a recursive method in TreeNode class that computes the sum of quadratic powers of
     * all keys in a binary search tree.
     */
    public int quadraticSummation() { return 0;}

}

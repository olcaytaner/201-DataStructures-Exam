package Tree;

public class Tree {

    protected TreeNode root;

    public Tree(){
        root = null;
    }

    public TreeNode getRoot(){
        return root;
    }

    public void setRoot(TreeNode root){
        this.root = root;
    }

    protected void insertChild(TreeNode parent, TreeNode child){
        if (parent == null) {
            root = child;
        } else {
            if (child.data < parent.data) {
                parent.left = child;
            } else {
                parent.right = child;
            }
        }
    }

    public void iterativeInsert(TreeNode node){
        TreeNode parent = null;
        TreeNode tmp = root;
        while (tmp != null) {
            parent = tmp;
            if (node.getData() < tmp.getData()){
                tmp = tmp.getLeft();
            } else {
                tmp = tmp.getRight();
            }
        }
        insertChild(parent, node);
    }

    public void prettyPrint(){
        if (root != null){
            root.prettyPrint(0);
        }
    }

    public void insertArray(int[] data) {
        for (int datum : data) {
            iterativeInsert(new TreeNode(datum));
        }
    }

    /**
     * Write a non-recursive method which returns a string that contains the two smallest numbers in the binary search tree: You are not allowed
     * to use any external data structures. (Hint: There are 3 cases: (i) The smallest number is on the left side and
     * it has right descendants, (ii) The smallest number is on the left side and it has no right descendants,
     * (iiii) The smallest number is the root.)
     */
    public String bottomTwo(){
        return "";
    }

    /**
     * Write a \textbf{non-recursive} method in Tree class that computes and returns the number of nodes with even
     * values in a binary search tree by using queue. You are only allowed to traverse the tree once.
     */
    public int countEvenNodes(){
        return 0;
    }

    /**
     * Write a non-recursive method in Tree class that returns the depth of the node containing a given data $X$ in a
     * binary search tree. You are not allowed to use any tree methods, just attributes, constructors, getters and
     * setters. Depth of the root node is 1.
     */
    public int depthOfNode(int X){
        return 0;
    }

    /**
     * T1 and T2 are two binary trees. Write the recursive method in Tree class to determine if T1 is identical to T2.
     */
    public boolean isIdentical(TreeNode T1, TreeNode T2){
        return false;
    }

    /**
     * Write a nonrecursive method using Stack that finds the difference between the number of leftist nodes and
     * rightist nodes in a binary search tree. A node is leftist~(rightist) if it has only left~(right) child.
     */
    public int leftistOrRightist(){
        return 0;
    }

    /**
     * Write a non-recursive method in the {\bf Tree} class, which returns the keys on the path as an array, where the
     * path is defined by the current parent as follows: If the parent is odd, go left; otherwise go right. The array
     * should contain only that many items not more not less.
     */
    public int[] pathList(){
        return null;
    }

    /**
     * Write the non-recursive method in Tree class that computes the products of all keys in a binary search tree by
     * using stack.
     */
    public int product(){
        return 0;
    }

    /**
     * Write a non-recursive method in Tree class, which first finds the minimum (A) and maximum (B) elements in the
     * tree. The method will then randomly search a number between [A, B] $N$ times and returns the average number of
     * nodes visited in this search. You are not allowed to use any tree methods.
     */
    public double simulateSearch(int N){
        return 0;
    }

    /**
     * Write a non-recursive method in Tree class, which sums the keys on the path, where the path is defined by the
     * parameter path as follows: (i) Path consists of 0's and 1's such as 10011. (ii) A 1 represents to go right, a 0
     * represents to go left. If the path is 1011, you start from root, you go first right, then left, then right, then
     * right. If the path is 001, you start from root, you go first left, then left, then right. You will use charAt
     * function in strings.
     */
    public int sumOfPath(String path){
        return 0;
    }

    /**
     * Write a non-recursive method that computes and returns the number of nodes with odd values in a binary search
     * tree by using queue. You are only allowed to traverse the tree once. You may assume tree has at least 1 node.
     */
    public int countOddNodes(){
        return 0;
    }

}

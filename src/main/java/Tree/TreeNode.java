package Tree;

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

    void accumulateLeafNodes(Queue queue){
    }

    int averages(){
        return 0;
    }

    int[] collectNodes(){
        return null;
    }

    boolean hasPath(int[] path){
        return false;
    }

    int higherThanX(int X){
        return 0;
    }

    public int[] lessThanX(int x){
        return null;
    }

    int sumOfNodesBetween(int p, int q){
        return 0;
    }

    int sumOfPath(String path){
        return 0;
    }

    int sumOfTree(int X){
        return 0;
    }

}

import Tree.TreeNode;
import Tree.Tree;

public class Test {

    public static void main(String[] args){
        Tree tree = new Tree();
        tree.iterativeInsert(new TreeNode(6));
        tree.iterativeInsert(new TreeNode(4));
        tree.iterativeInsert(new TreeNode(8));
        tree.iterativeInsert(new TreeNode(1));
        tree.iterativeInsert(new TreeNode(10));
        tree.iterativeInsert(new TreeNode(5));
        tree.iterativeInsert(new TreeNode(7));
        tree.prettyPrint();
    }
}

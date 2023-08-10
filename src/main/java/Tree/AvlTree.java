package Tree;

public class AvlTree extends Tree{

    public AvlTree(){
        super();
    }

    private int getHeight(AvlTreeNode node){
        if (node == null){
            return 0;
        } else {
            return node.getHeight();
        }
    }

}

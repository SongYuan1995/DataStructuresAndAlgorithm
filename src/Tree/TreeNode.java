package Tree;

public class TreeNode {
    //节点的权
    int value;

    //左儿子
    TreeNode leftNode;

    //右儿子
    TreeNode rightNode;

    public TreeNode(int value) {
        this.value = value;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
}

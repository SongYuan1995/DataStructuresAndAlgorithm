package Tree;

public class BinaryTreeTest {
    public static void main(String[] args) {
        //创建一棵树
        BinaryTree binaryTree = new BinaryTree();
        //创建一个根节点
        TreeNode root = new TreeNode(1);
        //把根节点赋给树
        binaryTree.setRoot(root);
        //创建根节点的左儿子节点
        TreeNode leftNode = new TreeNode(2);
        //创建根节点的右儿子节点
        TreeNode rightNode = new TreeNode(3);
        //把两个节点赋给跟节点
        root.setLeftNode(leftNode);
        root.setRightNode(rightNode);



    }



}

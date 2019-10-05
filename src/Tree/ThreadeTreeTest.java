package Tree;

public class ThreadeTreeTest {
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
        //创建左儿子节点的两个子节点
        leftNode.setLeftNode(new TreeNode(4));
        leftNode.setRightNode(new TreeNode(5));
        //创建右儿子节点的两个子节点
        rightNode.setLeftNode(new TreeNode(6));
        rightNode.setRightNode(new TreeNode(7));

        //前序遍历
        binaryTree.frontShow();
        System.out.println("==========");

        //中序遍历
        binaryTree.middleShow();
        System.out.println("==========");

        //后序遍历
        binaryTree.afterShow();
        System.out.println("=========");

        // 前序查找
        System.out.println(binaryTree.frontSearch(9)== null);
        System.out.println("=========");

        //删除子树
        binaryTree.delete(6);
        binaryTree.frontShow();








    }



}

package Tree;

public class ThreadeBinaryTree {
    //根节点
    ThreadeNode root;
    //用于临时存储前驱节点
    ThreadeNode pre = null;


    public void setRoot(ThreadeNode root) {
        this.root = root;
    }
    //中序线索化二叉树
    public void threadNodes() {
        threadNodes(root);
    }

    public void threadNodes(ThreadeNode node) {
        //如果当前节点为null，直接返回
        if (node == null) {
            return;
        }
        //处理左子树:
        threadNodes(node.leftNode);
        //处理前驱节点
        if (node.leftNode == null) {
            //让当前节点的做指针指向前驱节点
            node.leftNode = pre;
            //改变当前节点左指针的类型
            node.leftType = 1;
        }
        //处理前驱节点的右指针，如果前驱节点的右指针是null（没有指向右子树）
        if (pre != null && pre.rightNode == null) {
            //让前驱节点d的右指针指向当前节点
            pre.rightNode = node;
            //改变前驱节点的右指针类型
            pre.rightType = 1;
        }


    }




}

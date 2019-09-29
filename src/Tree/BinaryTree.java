package Tree;

public class BinaryTree {
    //根节点
    TreeNode root;

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    //前序遍历
    public void frontShow() {
        if (root != null) {
            root.frontShow();
        }
    }

    //中序遍历
    public void middleShow() {
        if (root != null) {
            root.middleShow();
        }
    }

    //后序遍历
    public void afterShow() {
        if (root != null) {
            root.afterShow();
        }
    }

    //前序查找
    public TreeNode frontSearch(int i) {
        return root.frontSearch(i);
    }

    //删除子树
    public void delete(int i) {
        if (i == root.value) {
            root = null;
        } else {
            root.delete(i);
        }
    }
}

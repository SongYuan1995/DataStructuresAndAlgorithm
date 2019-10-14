package BinarySortTree;

/**
 * @Auther:  SongYuan
 * @Date:  2019/10/10 13:12
 * @Description: 二叉排序树的节点
 */
public class Node {

    int value;
    Node right;
    Node left;

    public Node(int value) {
        this.value = value;
    }

    /**
     * 向二叉排序树中添加节点
     * @param node
     */
    public void add(Node node) {
        if (node == null) {
            return;
        }
        //判断传入的节点的值与当前节点的值的大小
        if (this.value < node.value) {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.add(node);
            }
        } else {
            if (this.left == null) {
                this.left = node;
            } else {
                this.left.add(node);
            }

        }

    }

    /**
     * 二叉树的中序遍历
     */
    public void middleShow(Node node) {
        if (node.left != null) {
            middleShow(node.left);
        }
        System.out.println(node.value);
        if (node.right != null) {
            middleShow(node.right);
        }
    }

    /**
     * 查找节点
     * @param value
     * @return
     */
    public Node search(int value) {
        if (this.value == value) {
            return this;
        } else if (this.value < value) {
            if (right == null) {
                return null;
            }
            return right.search(value);
        } else {
            if (left == null) {
                return null;
            }
            return left.search(value);
        }

    }

    /**
     * 寻找父节点
     * @param value
     * @return
     */
    public Node searchParent(int value) {
        if ((this.left != null && this.left.value == value) || this.right != null && this.right.value == value) {
            return this;
        } else {
            if (this.value>value&&this.left!=null) {
                return this.left.searchParent(value);
            } else if (this.value < value && this.right != null) {
                return this.right.searchParent(value);
            }
            return null;
        }



    }
}

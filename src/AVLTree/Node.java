package AVLTree;

import jdk.nashorn.internal.ir.IfNode;

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

    public int height() {
        return Math.max(left == null?0:left.height(),right == null?0:right.height())+1;
    }

    /**
     * 左子树的高度
     * @return
     */
    public int leftHeight() {
        if (left != null) {
            return left.height();
        } else {
            return 0;
        }
    }

    /**
     * 右子树的高度
     * @return
     */
    public int rightHeight() {
        if (right != null) {
            return right.height();
        } else {
            return 0;
        }
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

        //检查是否平衡
        if (leftHeight() - rightHeight() >=2) {
            //进行双旋转
            if (left != null && left.leftHeight() < left.rightHeight()) {
                left.leftRotate();
                rightRotate();
            } else {
                //进行右旋转
                rightRotate();
            }

        }

        if (leftHeight() - rightHeight() <=-2) {
            //进行左旋转
            leftRotate();
        }



    }

    /**
     * 进行左旋转
     */
    private void leftRotate() {
        //创建一个新节点，值等于当前节点的值
        Node newLeft = new Node(value);
        //当前节点的左子树赋给新节点的左子树
        newLeft.left = left;
        //把当前节点的右子节点的左子树设置为新节点的右子树
        newLeft.right = right.left;
        //把当前节点的值换位右子节点的值。
        value = right.value;
        //把当前节点的右子树换位右子节点的右子树
        right = right.right;
        //把当前节点的左子树设置为新节点
        left = newLeft;
    }

    /**
     * 右旋转
     */
    private void rightRotate() {
        //创建一个新节点，值等于当前节点的值
        Node newRight = new Node(value);
        //把当前节点的右子树赋给新节点的右子树
        newRight.right = right;
        //把当前节点的左子节点的右子树设置为新节点的左子树
        newRight.left = left.right;
        //把当前节点的值换为左子节点的值
        value = left.value;
        //把当前节点节点的左子树换位左子节点的左子树
        left = left.left;
        //把当前节点的右子树设置为新节点
        right = newRight;

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

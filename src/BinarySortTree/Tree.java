package BinarySortTree;

/**
 * @Auther: SongYuan
 * @Date: 2019/10/10 13:12
 * @Description:二叉排序树
 */
public class Tree {
    Node root;

    //中序遍历
    public void middleShow() {
        if (root == null) {
            return;
        } else {
            root.middleShow(root);
        }
    }

    //添加节点
    public void add(Node node) {
        //如果是一棵空树
        if (root == null) {
            root = node;
        } else {
            root.add(node);
        }
    }

    /**
     * 查找节点
     * @param value
     * @return
     */
    public Node search(int value) {
        if (root == null) {
            return null;
        } else {
            return root.search(value);
        }

    }

    /**
     * 删除节点
     * @param value
     */
    public void delte(int value) {
        if (root == null) {
            return;
        }
        //找到这个节点
        Node target = search(value);
        if (target == null) {
            return;
        }

        //找到它的父节点
        Node parent = searchParent(value);
        //要删除的是叶子节点
        if (target.left==null && target.right==null) {
            //删除的节点是父节点的左子节点
            if (parent.left.value == value) {
                parent.left = null;
            } else {
                parent.right = null;
            }

        }


    }

    /**
     * 找到父节点
     * @param value
     * @return
     */
    public Node searchParent(int value) {
        if ((root == null)) {
            return null;
        }
        return root.searchParent(value);
    }




}

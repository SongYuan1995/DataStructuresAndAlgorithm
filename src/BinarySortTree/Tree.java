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


}

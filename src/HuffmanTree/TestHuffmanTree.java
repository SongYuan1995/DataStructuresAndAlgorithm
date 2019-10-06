package HuffmanTree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;

/**
 * 赫夫曼树(最优二叉树):哈夫曼树是带权路径长度最短的树，权值较大的结点离根较近。
 * 结点的带权路径长度为：从根结点到该结点之间的路径长度与该结点的权的乘积。
 * 树的带权路径长度:规定为所有叶子结点的带权路径长度之和，记为WPL。
 */
public class TestHuffmanTree {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 7, 8, 29, 11, 23, 14, 5};
        Node huff = createHuffmanTree(arr);
        huff.frontShow();
    }


    public static Node createHuffmanTree(int[] arr) {
        //首先使用数组中所有的元素创建若干个二叉数(只有一个节点)
        List<Node> nodes = new ArrayList<>();
        for (int i : arr) {
            nodes.add(new Node(i));
        }
        while (nodes.size() > 1) {
            //排序
            Collections.sort(nodes);

            //取出权值最小的两个二叉树
            Node left = nodes.get(nodes.size() - 1);
            Node right = nodes.get(nodes.size() - 2);

            //创建一颗新的二叉树
            //新的根节点的权值是前两取出来的两颗二叉树的根节点的权值之和

            Node parent = new Node(left.value + right.value);
            parent.left = left;
            parent.right =right;

            //把取出来的两个二叉树移除
            nodes.remove(left);
            nodes.remove(right);

            //把新建的二叉树放入及原来的集合中
            nodes.add(parent);
        }
            return nodes.get(0);
    }




}

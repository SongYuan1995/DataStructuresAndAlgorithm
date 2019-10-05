package HuffmanTree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;

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

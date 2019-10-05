package HuffmanTree;

public class Node implements Comparable<Node> {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    //前序遍历
    public void frontShow() {
        System.out.println(value);
        if (left != null) {
            left.frontShow();
        }
        if (right != null) {
            right.frontShow();
        }

    }

    @Override
    public int compareTo(Node o) {
        return o.value-this.value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}

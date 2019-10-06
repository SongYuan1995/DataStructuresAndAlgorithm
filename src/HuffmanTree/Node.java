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
        System.out.println(this.value);
        if (this.left != null) {
            this. left.frontShow();
        }
        if (this.right != null) {
            this.right.frontShow();
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

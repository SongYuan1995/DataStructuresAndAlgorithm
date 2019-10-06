package HaffmanCode;

/**
 * @Auther: SongYuan
 * @Date: 2019/10/6 16:24
 * @Description: 赫夫曼编码表实现
 */
public class Node implements Comparable<Node> {
    //节点携带数据
    Byte data;
    //节点的权值
    int weight;
    //左右子节点
    Node left;
    Node right;

    public Node(Byte data, int weight) {
        this.data = data;
        this.weight = weight;
    }

    public Node() {
    }

    @Override
    public int compareTo(Node o) {
        return o.weight - this.weight;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", weight=" + weight +
                '}';
    }
}

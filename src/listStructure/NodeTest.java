package listStructure;

public class NodeTest {
    public static void main(String[] args) {
        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        //追加节点
        node.append(node2).append(node3).append(node4).append(node5);
        //取出下一个节点的数据
//        System.out.println(node.next().getData());
        //判断节点是否为最后一个节点
//        System.out.println(node.next().next().next().next().islast());
        // 显示所有节点信息
        //node.show();
        //删除第三个节点
       // node.next.remove();
        node.show();
        //再2之后插入一个6
        Node node6 = new Node(6);
        node2.insertAftert(node6);
        System.out.println();
        node.show();
    }




}

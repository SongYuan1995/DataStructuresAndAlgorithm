package listStructure04;

/**
 * @Auther:  SongYuan
 * @Description: 单链表
 */
public class Node {

    //节点数据
    int data;

    //下一个节点
    Node next;

    public Node(int data) {
        this.data = data;
    }

    //追加节点
    public Node append(Node node) {
        //当前节点
        Node current = this;

        while (true) {
            //取出下一个节点
            Node next = current.next;
            //如果下一个节点为null，当前节点是最后一个节点
            if (next == null) {
                break;
            }
            //赋给当前节点
            current = next;
        }
        //向当前节点的最后一个子节点追加下一个节点
        current.next = node;
        return this;
    }

    //获取下一个节点
    public Node next() {
        return this.next;
    }

    //获取节点中的数据
    public int getData() {
        return this.data;
    }

    //当前节点是否是最后一个节点
    public boolean islast() {
        return next == null;
    }

    //删除下一个节点
    public void remove(){
        //当前节点的下下一个节点
        Node newNode = this.next.next;
        //把下下一个节点设置为当前节点的下一个节点
        this.next = newNode;
    }

    //插入一个节点
    public void insertAftert(Node node) {
        //获取(原来)下一个节点
        Node nextNext = this.next;
        //把新节点作为当前节点的下一个节点
        this.next = node;
        //把（原来）下一个节点作为新节点的下一个节点
        node.next = nextNext;
    }




    //显示所有节点信息
    public void show(){
        //当前节点
        Node current = this;
        while(true){
            System.out.print(current.data+"   ");
            current = current.next;
            if(current == null){
                break;
            }
        }
    }










}

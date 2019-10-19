package listStructure04;

/**
 * 双向循环链表
 */
public class DoubleNode {
    //上一个节点
    DoubleNode last = this;
    //下一个节点
    DoubleNode next = this;
    //节点数据
    int data;

    public DoubleNode(int data) {
        this.data = data;
    }

    //增加节点
    public void addNode(DoubleNode node) {
        //获取当前节点本来的下一个节点
        DoubleNode nextNext = this.next;
        //将新节点作为当前节点的下一个节点
        this.next = node;
        //将本来的下一个节点作为新节点的下一个节点
        node.next = nextNext;
        //将本来的下一个节点的上一个节点设置为新节点
        nextNext.last = node;
    }

    //下一个节点
    public DoubleNode next() {
        return this.next;
    }

    //上一个节点
    public DoubleNode last() {
        return this.last;
    }






}

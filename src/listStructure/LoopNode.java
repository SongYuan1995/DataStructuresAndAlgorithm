package listStructure;

/**
 * 循环链表
 */
public class LoopNode {

    //节点数据
    int data;

    //下一个节点
    LoopNode next = this;

    public LoopNode(int data) {
        this.data = data;
    }

    //获取下一个节点
    public LoopNode next() {
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
        LoopNode newNode = this.next.next;
        //把下下一个节点设置为当前节点的下一个节点
        this.next = newNode;
    }

    //插入一个节点
    public void insertAftert(LoopNode node) {
        //获取(原来)下一个节点
        LoopNode nextNext = this.next;
        //把新节点作为当前节点的下一个节点
        this.next = node;
        //把（原来）下一个节点作为新节点的下一个节点
        node.next = nextNext;
    }













}

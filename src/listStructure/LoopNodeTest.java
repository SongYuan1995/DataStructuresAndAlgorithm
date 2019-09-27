package listStructure;

public class LoopNodeTest {

    public static void main(String[] args) {
        LoopNode loopNode1 = new LoopNode(1);
        LoopNode loopNode2 = new LoopNode(2);
        LoopNode loopNode3 = new LoopNode(3);
        LoopNode loopNode4 = new LoopNode(4);
        loopNode1.insertAftert(loopNode2);
        loopNode2.insertAftert(loopNode3);
        System.out.println(loopNode1.next.getData());
        System.out.println(loopNode2.next.getData());
    }


}

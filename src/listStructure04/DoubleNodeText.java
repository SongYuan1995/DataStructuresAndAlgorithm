package listStructure04;

public class DoubleNodeText {

    public static void main(String[] args) {
        DoubleNode doubleNode = new DoubleNode(1);
        DoubleNode doubleNode2 = new DoubleNode(2);
        DoubleNode doubleNode3 = new DoubleNode(3);
        doubleNode.addNode(doubleNode2);
        System.out.println(doubleNode.next.data);
        System.out.println(doubleNode.last.data);


    }






}

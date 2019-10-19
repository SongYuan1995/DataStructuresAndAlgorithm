package stack02;

public class MyStackTest {

    public static void main(String[] args) {
        //创建一个新栈
        MyStack myStack1 = new MyStack();

        //压入数组
        myStack1.push(1);
        myStack1.push(2);
        myStack1.push(3);
        myStack1.push(4);
        myStack1.push(5);

        // 弹出栈顶元素
        myStack1.pop();
        myStack1.pop();
        myStack1.pop();

        //查看栈顶元素
        myStack1.pop();
        myStack1.pop();
        //System.out.println(myStack1.peek());



        //判断栈是否为空
        System.out.println(myStack1.isEmpty());
    }




}

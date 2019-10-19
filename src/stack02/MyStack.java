package stack02;

public class MyStack {
    // 栈的底层我们使用数组来存储数据
    int[] elements;

    public MyStack() {
        elements = new int[0];
    }

    //压入元素
    public void push(int element) {
        //建立一个新数组
        int[] newArr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;
        //新数组替换旧数组
        elements = newArr;
    }

    //取出栈顶元素
    public int pop() {

        if (elements.length <= 0) {
            throw new RuntimeException("stack is empty");
        }
        //取出栈顶元素
        int top = elements[elements.length - 1];
        //建立一个新数组
        int[] newArr = new int[elements.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = elements[i];
        }
        elements = newArr;
        return top;
    }

    //查看栈顶元素
    public int peek(){
        if (elements.length <= 0) {
            throw new RuntimeException("stack is empty");
        }
        return elements[elements.length-1];
    }

    //判断栈是否为空
    public boolean isEmpty(){
        if (elements.length == 0){
            return true;
        }
        else {
            return false;
        }
    }

    //查看全部元素
    public void showAll() {
        for (int element : elements) {
            System.out.println(element);
        }
    }





}

package queue;

public class MyQueue {
    int[] elements;

    public MyQueue() {
        elements = new int[0];
    }

    //入队
    public void add(int element) {
        //创建新数组
        int[] newArr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;
        //新数组替换旧数组
        elements = newArr;
    }

    //出队
    public int poll() {
        if (elements.length == 0) {
            throw new RuntimeException("the quque is empty");
        }

        //创建新数组
        int[] newArr = new int[elements.length - 1];

        //出队元素
        int element = elements[0];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = elements[i + 1];
        }
        //新数组替换旧数组
        elements = newArr;
        return element;
    }







}

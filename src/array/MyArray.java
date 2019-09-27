package array;
/**
 * 面向对象的数组
 */

import java.util.Arrays;

public class MyArray {
    //创建容器：一个用于存储数据的数组
    private int[] elements;

    public MyArray() {
        elements = new int[0];
    }

    //获取数组的长度
    public int size(){
        return elements.length;
    }

    //向数组的末尾添加一个元素
    public void add(int element){
        int[] newArr = new int[elements.length+1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        //把添加的元素放入数组中
        newArr[elements.length] = element;
        //使用新数组替换就数组
        elements = newArr;
    }

    //打印所有元素到控制台
    public void show(){
        System.out.println(Arrays.toString(elements));
    }

    //删除数组中的元素
    public void delete(int index){
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        } else {
            //新建一个新数组，数组长度为原数组-1
            int[] newArr = new int[elements.length-1];
            for (int i = 0; i < newArr.length; i++) {
                if (index < i) {
                    newArr[i] = elements[i];
                } else {
                    newArr[i] = elements[i+1];
                }
            }
            //新数组替换就数组
            elements = newArr;
        }
    }

    //获取某个元素
    public int get(int index) {
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        return elements[index];
    }

    //插入元素到指定位置
    public void insert(int index,int element){
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        //创建一个新数组，长度为原数组长度+1
        int[] newArr = new int[elements.length+1];
        //将原数组中的数据插入新数组中
        for (int i = 0; i < elements.length; i++) {
            if (i < index) {
                newArr[i] = elements[i];
            }
            else{
                newArr[i+1] = elements[i];
            }
        }
        //插入元素
        newArr[index] = element;
        //将新数组替换为旧数组
        elements = newArr;
    }


}

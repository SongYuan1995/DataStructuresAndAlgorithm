package Tree;

/**
 * 顺序存储的二叉树
 */
public class ArrayBinaryTree {
    //    顺序存储二叉树
    //    顺序二叉树通常只考虑完全二叉树
    //    第n个元素的左子节点为 2 * n + 1
    //    第n个元素的右子节点为 2 * n + 2
    //    第n个元素的父节点为 (n-1) / 2
        int[] data ;

    public ArrayBinaryTree(int[] data) {
        this.data = data;
    }

    //顺序存储的二叉树的前序遍历
    public void frontShow(){
        frontShow(0);
    }
    public void frontShow(int startIndex) {
        //当前节点的值
        if (data != null) {
            System.out.print(data[startIndex]+" ");
        }
        //左儿子的值
        if (2*startIndex+1< data.length) {
            frontShow(2*startIndex+1);
        }
        //右儿子的值
        if (2*startIndex+2< data.length) {
            frontShow(2*startIndex+2);
        }

    }


    public static void main(String[] args) {
        int[] testData = new int[]{1, 2, 3, 4, 5, 6, 7};
        ArrayBinaryTree arrayBinaryTree = new ArrayBinaryTree(testData);
        arrayBinaryTree.frontShow();
    }

}

package AlgorithmOfSort05;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 23, 53, 3, 98, 20, 19, 99};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        //外层循环：控制总共循环多少轮
        for (int i = 0; i < arr.length-1; i++) {
            //内层循环：控制单轮总共循环多少次
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }





    }


}

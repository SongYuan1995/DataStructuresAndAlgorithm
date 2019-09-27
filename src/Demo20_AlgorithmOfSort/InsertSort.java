package Demo20_AlgorithmOfSort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 25, 28, 13, 31, 6, 9, 0};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void insertSort(int[] arr) {
        //从下标1开始遍历所有数组，（一个数组认为是有序的）
        for (int i = 1; i < arr.length; i++) {
            //如果遍历的第一个元素比之前有序的最后一个数字小
            if (arr[i] < arr[i - 1]) {
                //把当前遍历数字存起来
                int temp = arr[i];
                //遍历当前数字之前的所有数字（从后到前 ）
                int j;
                for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
                    //把前一个数字赋给后一个数字
                    arr[j + 1] = arr[j];
                }
                //把临时变量赋给不满足条件的最后一个元素
                arr[j+1] = temp;

            }


        }



    }



}

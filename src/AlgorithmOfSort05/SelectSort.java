package AlgorithmOfSort05;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 52, 9, 80, 110, 5, 72};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        //遍历所有的数
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            int j;
            for (j = i+1; j <arr.length ; j++) {
                //找出i后面所有数字中最小的数字
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

        }





    }






}

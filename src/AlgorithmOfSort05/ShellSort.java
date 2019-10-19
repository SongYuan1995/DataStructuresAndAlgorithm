package AlgorithmOfSort05;

import java.util.Arrays;

/**
 * 希尔排序
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 234, 367, 25, 6, 0, 99, 35, 34, 12, 8};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int[] arr) {
        //遍历所有步长，从n/2到1
        for (int gap = arr.length/2; gap > 0; gap/=2) {
            //对各个分组进行插入排序
            for (int i = gap; i < arr.length; i++) {
                //将arr[i]插入到所在分组的正确位置
                int j;
                int insert = arr[i];
                for (j = i-gap; j >= 0 && insert < arr[j]; j-=gap) {
                     arr[j + gap] = arr[j];
                    /*if (arr[j] > arr[j+gap]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + gap] = temp;
                    */}
                arr[j+gap] = insert;

            }
        }




    }



}

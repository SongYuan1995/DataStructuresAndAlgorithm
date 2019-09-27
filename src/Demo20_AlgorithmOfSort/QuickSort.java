package Demo20_AlgorithmOfSort;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{44, 3, 80, 27, 38, 53, 26, 64, 9};
        quickSort(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int startIndex, int endIndex, int arr[]) {

        if (startIndex < endIndex) {
            //把数组中的第0个作为标准数
            int standard = arr[startIndex];
            //记录要排序的下标
            int start = startIndex;
            int end = endIndex;

            //循环找出比标准数大的数和比标准数小的数
            while (start < end) {
                //右边的数字比标准数大
                while (arr[end] > standard && start < end) {
                    end --;
                }
                //右边的数比标准数小
                arr[start] = arr[end];

                //左边的数字比标准数小
                while (arr[start] < standard && start < end) {
                    start ++;
                }
                //左边的数字比标准数大
                arr[end] = arr[start];

            }
            //把标准数赋给跳出循环后的start位置的元素
            arr[start]= standard ;

            //递归调用
                //处理比标准数小的数
            quickSort(startIndex, start, arr);
                //处理比标准数大的数
            quickSort(start+1,arr.length-1,arr);

        }




    }




}

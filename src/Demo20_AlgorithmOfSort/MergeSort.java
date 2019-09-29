package Demo20_AlgorithmOfSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 2, 4, 6, 8, 10};
        mergeSort(arr, 0, arr.length - 1);
//        merge(arr,0,2,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            //处理左边的数组
            mergeSort(arr, low, middle);
            //处理右边的数组
            mergeSort(arr, middle+1, high);
            //归并处理
            merge(arr, low, middle, high);
        }

    }



    public static void merge(int[] arr, int low, int middle, int high) {
        //建立一个临时数组，用于储存归并后的临时数组
        int[] temp = new int[high - low + 1];
        //记录第一个数组中要遍历的下标
        int i = low;
        //记录第二个数组中要遍历的下标
        int j = middle + 1;
        //用于记录存放再临时数组位置的下标
        int index = 0;
        //遍历两个数组中取出的数字，较小的放入临时数组中
        while (i <= middle && j <= high) {
            //如果第一个数组的数字更小
            if (arr[i] <= arr[j]) {
                temp[index] = arr[i];

                i++;
            }else{
                temp[index] = arr[j];

                j++;
            }
            index ++;
        }
        //将剩余数字全部存入临时数组
        while (i <= middle) {
            temp[index] = arr[i];
            index++;
            i++;
        }
        while (j <= high) {
            temp[index] = arr[j];
            index++;
            j++;
        }
        //把临时数组中的数据重新存入原数组
        for (int k = 0; k < temp.length; k++) {
            arr[k+low] = temp[k];
        }

    }
}

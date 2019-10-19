package search01;

/**
 * 查找算法之线性查找
 */
public class LinearSearch {
    public static void main(String[] args) {
        //目标数组
        int[] arr =new int[] {1,2,3,4,5,6,7};
        //目标元素
        int aim = 5;
        //目标元素所在下标
        int index = -1;
        //遍历查找
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == aim) {
                index = i;
                break;
            }
        }
        //打印目标元素的下标
        System.out.println(index);

    }








}

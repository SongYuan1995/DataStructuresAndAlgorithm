package search;

/**
 * 查找算法之二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        //目标数组
        int[] arr =new int[] {1,2,3,4,5,6,7};
        //目标元素
        int aim = 5;
        //目标元素所在下标
        int  index = -1;
        //开始位置
        int begin = 0;
        //结束位置
        int end = arr.length-1;
        //中间位置
        int mid = (begin+end)/2;
        //循环查找
        while (true) {
            //如果没有找到
            if (begin >= end){
                break;
            }
            //判断中间元素是不是目标元素
            if (aim == arr[mid]) {
                index = mid;
                break;
                //中间元素比目标元素小
            } else if (aim < arr[mid]) {
                begin = mid +1;
                mid = (begin+end)/2;
                //中间元素比目标元素大
            }else if (aim > arr[mid]){
                begin = mid -1;
                mid = (begin+end)/2;
            }
        }

        System.out.println(index);


    }



}

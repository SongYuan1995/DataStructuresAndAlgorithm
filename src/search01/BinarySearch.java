package search01;

/**
 * 查找算法之二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        //目标数组
        int[] arr =new int[] {1,3,4,6,8,9,13,21};
        //目标元素
        int aim = 9;
        //目标元素所在下标
        int  index = -1;
        //开始位置
        int begin = 0;
        //结束位置
        int end = arr.length-1;
        //中间位置
        int mid;
        //循环查找
        while (begin <= end) {
            mid = (begin+end)/2;

            //判断中间元素是不是目标元素
            if (aim == arr[mid]) {
                index = mid;
                break;
                //目标元素大于中间元素
            } else if (aim > arr[mid]) {
                begin = mid +1 ;
                //目标元素小于中间元素
            }else if (aim < arr[mid]){
                end = mid - 1 ;
            }
        }

        System.out.println(index);


    }



}

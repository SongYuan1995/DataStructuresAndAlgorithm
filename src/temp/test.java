package temp;

public class test {
    public static void main(String[] args) {
        String str = "123";
        int[] arr = {1};
        fun(arr,str);
        System.out.println(arr[0] + str);
    }

    public static void fun(int[] arr, String str) {
        arr[0] = 4;
        str = "456";

    }

}

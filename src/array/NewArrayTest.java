package array;

public class NewArrayTest {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        System.out.println(myArray.size());
        myArray.show();
        //删除
//        myArray.delete(2);
//        myArray.show();
//        System.out.println(myArray.get(0));

        //将45插入到数组倒数第二位
        myArray.insert(myArray.size()-1, 45);
        myArray.show();
    }




}

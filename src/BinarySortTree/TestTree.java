package BinarySortTree;

/**
 * @Auther: SongYuan
 * @Date: 2019/10/10 13:32
 * @Description:
 */
public class TestTree {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 3, 10, 12, 5, 1, 9};
        //创建一棵二叉排序树
        Tree binarySortTree = new Tree();
        for (int i : arr) {
            binarySortTree.add(new Node(i));
        }

        ///binarySortTree.middleShow();

        System.out.println(binarySortTree.search(9));


    }




}

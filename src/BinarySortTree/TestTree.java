package BinarySortTree;

/**
 * @Auther: SongYuan
 * @Date: 2019/10/10 13:32
 * @Description: 二叉排序树测试类
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
        //测试查找父节点
//        Node node1 = binarySortTree.searchParent(12);
//        System.out.println(node1.value);
        System.out.println("---------------");
        //删除叶子节点的情况
//        binarySortTree.delte(12);
//        binarySortTree.middleShow();
        //删除只有一个节点的情况
//        binarySortTree.delte(12);
//        binarySortTree.middleShow();
//        System.out.println("---------------");
//        binarySortTree.delte(10);
//        binarySortTree.middleShow();

        //删除有两棵子树的节点
        binarySortTree.delte(3);
        binarySortTree.middleShow();


    }




}

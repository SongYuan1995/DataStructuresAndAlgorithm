package AVLTree;

/**
 * @Auther: SongYuan
 * @Date: 2019/10/10 13:32
 * @Description: 二叉排序树测试类
 */
public class TestTree {

    public static void main(String[] args) {
        //int[] arr = new int[]{8,9,6,7,5,4};
        //int[] arr = new int[]{2,1,4,3,5,6};
        int[] arr = new int[]{8,9,5,4,6,7};
        //创建一棵二叉排序树
        Tree binarySortTree = new Tree();
        for (int i : arr) {
            binarySortTree.add(new Node(i));
        }
        System.out.println(binarySortTree.root.height());
        System.out.println("********树的高度*************");
        binarySortTree.middleShow();
        System.out.println("***********根节点**********");
        System.out.println(binarySortTree.root.value);


    }




}

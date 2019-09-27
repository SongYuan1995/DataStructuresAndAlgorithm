package Demo17_19;

import java.sql.SQLOutput;

public class FeibonaqieTest {
    //  递归
    //斐波那契数列 1,1,2,3,5,8,13......
    public static int fei(int i) {
        if (i == 1 || i == 2) {
            return 1;
        }
        else {
            return fei(i - 1) + fei(i - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fei(7));
    }


}

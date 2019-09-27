package Demo17_19;

public class HanNuoTaTest {
    //汉诺塔问题

    public static void main(String[] args) {
        hanNuo(4,'A','B','c');
    }

    /**
     *
     * @param n:一共有n个圆盘
     * @param from:开始的柱子
     * @param between:中间的柱子
     * @param aim:目标柱子
     */
    public static void hanNuo(int n,char from,char between,char aim) {
        //如果只有一个圆盘
        if (n == 1) {
            System.out.println("第1个圆盘从" + from + "移到" + aim);
        }
        //无论有多少个圆盘，都认为只有两个，即下面的一个和上面所有
        else{
            //把上面的圆盘移动到中间的盘子
            hanNuo(n-1,from,aim,between);
            //把下面的圆盘移动到目标位置
            System.out.println("第" + n + "个圆盘移动到" + aim);
            //把中间的盘子移动到目标位置
            hanNuo(n-1,between,from,aim);

        }
    }



}

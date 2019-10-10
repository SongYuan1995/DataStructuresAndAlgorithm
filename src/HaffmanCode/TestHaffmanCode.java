package HaffmanCode;

import Tree.ArrayBinaryTree;

import javax.sound.midi.Soundbank;
import java.util.*;

/**
 * @Auther: SongYuan
 * @Date: 2019/10/6 16:27
 * @Description:赫夫曼编码测试类
 */
public class TestHaffmanCode {
    static StringBuilder sb = new StringBuilder();
    static Map<Byte, String> huffCodes = new HashMap<>();


    public static void main(String[] args) {
        String msg = "can you can a can as a can canner can a can.";
        byte[] beforeHaffman = msg.getBytes();
        //进行赫夫曼编码
        byte[] afterHaffman = huffmanZip(beforeHaffman);
        //使用赫夫曼编码进行解码
        byte[] originBytes = decode(huffCodes, afterHaffman);
        System.out.println(Arrays.toString(beforeHaffman));
        System.out.println(new String(originBytes));

    }

    /**
     * 使用指定的赫夫曼编码进行解码
     * @param huffCodes
     * @param afterHaffman
     * @return
     */
    private static byte[] decode(Map<Byte, String> huffCodes, byte[] afterHaffman) {
        StringBuilder b = new StringBuilder();
        //把byte数组转换为二进制的字符串
        for (int i = 0; i < afterHaffman.length; i++) {
            boolean flag = (i == afterHaffman.length - 1);
            b.append(bytetoStr(!flag,afterHaffman[i]));
        }
        //把字符串按照指定的哈夫曼编码进行解码
        //把Hashmap的键值对进行调换
        Map<String, Byte> map = new HashMap<>();
        for (Map.Entry<Byte, String> entry : huffCodes.entrySet()) {
            map.put(entry.getValue(), entry.getKey());
        }
        //创建一个集合用于存储list
        List<Byte> list = new ArrayList<>();
        //处理字符串
        for (int i = 0; i < b.length(); ) {
            int count = 1;
            boolean flag = true;
            Byte by = null;
            while (flag) {
                //截取出一个byte
                String key = b.substring(i, i+count);
                by = map.get(key);
                if (by != null) {
                    flag = false;
                } else {
                    count++;
                }
            }
            list.add(by);
            i += count;

        }
        //把集合转换为数组
        byte[] bytes = new byte[list.size()];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = list.get(i);
        }
        return bytes;
    }

    private static String bytetoStr(boolean flag,byte b) {
        int temp = b;
        if (flag) {
            temp |= 256;
        }
        String str = Integer.toBinaryString(temp);
        if (flag) {
            return str.substring(str.length() - 8);
        } else {
            return str;
        }

    }


    /**
     * 进行赫夫曼编码压缩的方法
     *
     * @param beforeHaffman
     * @return
     */
    private static byte[] huffmanZip(byte[] beforeHaffman) {
        //统计每一个byte出现的次数，并放入一个集合中
        List<Node> nodes = getNodes(beforeHaffman);

        //创建一棵赫夫曼树
        Node haffTree = createHaffmanTree(nodes);
        //创建一个赫夫曼编码表
        Map<Byte, String> huffmanCodes = getCodes(haffTree);
       // System.out.println(huffmanCodes);

        //编码
        byte[] b = zip(beforeHaffman, huffmanCodes);

        return b;
    }

    /**
     * 进行赫夫曼编码
     * @param beforeHaffman
     * @param huffmanCodes
     * @return
     */
    private static byte[] zip(byte[] beforeHaffman, Map<Byte, String> huffmanCodes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : beforeHaffman) {
            sb.append(huffmanCodes.get(b));
        }
            //定义长度
        int len;
        if (sb.length() % 8 == 0) {
            len = sb.length() / 8;
        } else {
            len = sb.length() / 8 + 1;
        }
        //用于存储压缩后的length
        byte[] by = new byte[len];
        int index = 0;
        for (int i = 0; i < sb.length(); i+=8) {
            String strByte;
            if (i + 8 > sb.length()) {
                strByte = sb.substring(i);
            } else {
                strByte = sb.substring(i, i + 8);
            }
            byte byt = (byte) Integer.parseInt(strByte, 2);
            by[index] = byt;
             index ++;

        }
        return by;
    }




    /**
     * 根据赫夫曼树获取赫夫曼编码
     *
     * @param tree
     * @return
     */
    private static Map<Byte, String> getCodes(Node tree) {
        if (tree == null) {
            return null;
        }
        getCodes(tree.left, "0", sb);
        getCodes(tree.right, "1", sb);
        return huffCodes;
    }

    private static void getCodes(Node node, String code, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder(sb);
        sb2.append(code);
        if (node.data == null) {
            getCodes(node.left, "0", sb2);
            getCodes(node.right, "1", sb2);
        } else {
            huffCodes.put(node.data, sb2.toString());
        }



    }


    /**
     * 创建赫夫曼树
     *
     * @param nodes
     * @return
     */
    private static Node createHaffmanTree(List<Node> nodes) {
        while (nodes.size() > 1) {
            //排序
            Collections.sort(nodes);
            //取出两棵权值最低的二叉树
            Node left = nodes.get(nodes.size() - 1);
            Node right = nodes.get(nodes.size() - 2);
            //新建一棵二叉树
            Node parent = new Node(null, left.weight + right.weight);
            //把之前取出来的二叉树设置为新的二叉树的两个节点
            parent.left = left;
            parent.right = right;
            //删除前面取出的两棵二叉树
            nodes.remove(left);
            nodes.remove(right);

            //把新创建的二叉树放入集合中
            nodes.add(parent);

        }

        return nodes.get(0);
    }

    /**
     * 把byte数组转换为node集合
     *
     * @param beforeHaffman
     * @return
     */
    private static List<Node> getNodes(byte[] beforeHaffman) {
        List<Node> nodes = new ArrayList<>();
        //存储每一个Byte出现了多少次
        Map<Byte, Integer> counts = new HashMap<>();
        for (byte b : beforeHaffman) {
            Integer count = counts.get(b);
            if (count != null) {
                counts.put(b, count + 1);
            } else {
                counts.put(b, 1);
            }
        }

        //把每一个键值对转换为Node对象
        for (Map.Entry<Byte, Integer> entry : counts.entrySet()) {
            nodes.add(new Node(entry.getKey(), entry.getValue()));
        }
//        System.out.println(counts);
        return nodes;
    }


}

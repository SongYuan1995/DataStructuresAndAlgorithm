package Tree;

public class ThreadeNode {
    //节点的权
    int value;

    //左儿子
    ThreadeNode leftNode;

    //右儿子
    ThreadeNode rightNode;

    //标识指针类型
    int leftType;//0:指向子节点，1：指向前驱节点
    int rightType;//0：指向子节点 1：指向后继节点


    public ThreadeNode(int value) {
        this.value = value;
    }

    public void setLeftNode(ThreadeNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(ThreadeNode rightNode) {
        this.rightNode = rightNode;
    }

    //前序遍历
    public void frontShow() {
        //当前节点的值
        System.out.print(value+",");
        //节点的左儿子的值
        if (null != leftNode) {
            leftNode.frontShow();
        }
        //节点的右儿子的值
        if (null != rightNode) {
            rightNode.frontShow();
        }

    }

    //中序遍历
    public void middleShow() {
        //节点的左儿子的值
        if (null != leftNode) {
            leftNode.middleShow();
        }
        System.out.print(value+",");
        //节点的右儿子的值
        if (null != rightNode) {
            rightNode.middleShow();
        }
    }

    //后序遍历
    public void afterShow() {
        //节点的左儿子的值
        if (null != leftNode) {
            leftNode.afterShow();
        }
        if (null != rightNode) {
            rightNode.afterShow();
        }
        System.out.print(value+",");
    }

    //前序查找
    public ThreadeNode frontSearch(int i) {
        ThreadeNode target = null;
        //对比当前节点的值
        if (i == value) {
            return this;
        }
        //当前节点不是目标节点
        else {
            //查找左儿子
            if (leftNode != null) {
                //有可能能查到，有可能查不到，如果查不到，target还是null
                target = leftNode.frontSearch(i);
            }
            //如果不为空，说明在左儿子中已经找到
            if (null != target) {
                return target;
            }
            //查找右儿子
            if (rightNode != null) {
                target = rightNode.frontSearch(i);
            }
        }
        return target;
    }

    //删除子树
    public void delete(int i) {
        ThreadeNode parent = this;
        //判断左儿子
        if (parent.leftNode != null && leftNode.value == i) {
            //删除
            leftNode = null;
            return;
        }
        //判断右儿子
        if (parent.rightNode != null && rightNode.value == i) {
            //删除
            rightNode = null;
            return;
        }
        //递归检查并删除左儿子
        parent = leftNode;
        if (parent != null) {
            parent.delete(i);
        }
        //递归检查并删除右儿子
        parent = rightNode;
        if (parent != null) {
            parent.delete(i);
        }




    }
}

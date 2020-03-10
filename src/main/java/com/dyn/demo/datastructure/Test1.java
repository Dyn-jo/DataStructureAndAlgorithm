package com.dyn.demo.datastructure;

import com.dyn.demo.datastructure.list.LinkedList;
import com.dyn.demo.datastructure.list.List;
import com.dyn.demo.datastructure.list.SingleNode;
import com.dyn.demo.datastructure.list.Stack;
import com.dyn.demo.datastructure.tree.TreeNode;

/**
 *
 */
public class Test1 {

    public static void main(String[] args) {
//        test(new ArrayList());
//        test(new LinkedList());
//        test(new Stack());

        testTreeNode();
    }

    public static void testSingleNode() {

        SingleNode<String> node = new SingleNode<String>("1");
        for (int i = 2; i < 6; i++) {
            SingleNode.addData(i + "", node);
        }
        SingleNode temp = node;
        while (temp.getNext() != null) {
            System.out.println(temp.getItem());
            temp = temp.getNext();
        }
    }

    public static void test(List list) {
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        for (int i = 1; i < 6; i++) {
            list.add(i + "");
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ",");
        }
        System.out.println();

        list.insert("7", 2);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ",");
        }
        System.out.println();

        list.remove(4);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ",");
        }
        System.out.println();
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        if (list instanceof LinkedList) {
            System.out.println(((LinkedList) list).getFirst());
            System.out.println(((LinkedList) list).getLast());
        }
        if (list instanceof Stack) {
            System.out.println(((Stack) list).getTop());
            System.out.println(((Stack) list).getBottom());
        }
        System.out.println();

    }

    /**
     *      10
     * 9        20
     *       15      35
     */
    public static void testTreeNode() {

        //根节点-->10
        TreeNode treeNode1 = new TreeNode(10);
        //左-->9
        TreeNode TreeNode = new TreeNode(9);
        //右-->20
        TreeNode treeNode3 = new TreeNode(20);
        //20的左-->15
        TreeNode treeNode4 = new TreeNode(15);
        //20的右-->35
        TreeNode treeNode5 = new TreeNode(35);

        treeNode1.setLeftNode(TreeNode);
        treeNode1.setRightNode(treeNode3);

        treeNode3.setLeftNode(treeNode4);
        treeNode3.setRightNode(treeNode5);

        TreeNode.inTraverseBTree(treeNode1);

    }

}

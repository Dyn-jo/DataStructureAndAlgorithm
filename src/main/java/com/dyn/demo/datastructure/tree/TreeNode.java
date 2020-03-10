package com.dyn.demo.datastructure.tree;

import lombok.Data;

/**
 * 二叉树
 *
 * 中序遍历
 * 先访问根节点，然后访问左节点，最后访问右节点(根->左->右)
 * 先序遍历
 * 先访问左节点，然后访问根节点，最后访问右节点(左->根->右)
 * 后序遍历
 * 先访问左节点，然后访问右节点，最后访问根节点(左->右->根)
 *
 * @param <E>
 */
@Data
public class TreeNode<E> {

    TreeNode<E> leftNode;

    E item;

    TreeNode<E> rightNode;

    public TreeNode() {
    }

    public TreeNode(E item) {
        this.item = item;
    }

    public TreeNode(TreeNode<E> leftNode, E item, TreeNode<E> rightNode) {
        this.leftNode = leftNode;
        this.item = item;
        this.rightNode = rightNode;
    }

    /**
     * 如果是中序遍历：10->9->20->15->35
     *
     * 如果是先序遍历：9->10->15->20->35
     * 解释：访问完10节点过后，去找的是20节点，但20下还有子节点，因此先访问的是20的左节点15节点。
     * 由于15节点没有子节点了。所以就返回20节点，访问20节点。最后访问35节点
     *
     * 如果是后序遍历：9->15->35->20->10
     * 解释：先访问9节点，随后应该访问的是20节点，但20下还有子节点，因此先访问的是20的左节点15节点。
     * 由于15节点没有子节点了。所以就去访问35节点，由于35节点也没有子节点了，所以返回20节点，最终返回10节点
     *
     * @param treeNode
     */
    public static void inTraverseBTree(TreeNode treeNode) {
        if (treeNode != null) {
            System.out.println(treeNode);
            //访问左节点
            inTraverseBTree(treeNode.getLeftNode());
            //访问右节点
            inTraverseBTree(treeNode.getRightNode());
        }

    }

    @Override
    public String toString() {
        return item.toString();
    }

}

package com.dyn.demo.datastructure.list;

import lombok.Getter;

/**
 * 单链表存储结构
 * @param <E>
 */
@Getter
public class SingleNode<E> {

    private E item;

    private SingleNode<E> next;

    public SingleNode(E element) {
        this.item = element;
    }

    public SingleNode(SingleNode<E> next, E element) {
        this.item = element;
        this.next = next;
    }

    public static <E> void addData(E element, SingleNode head) {

        //初始化要加入的节点
        SingleNode newNode = new SingleNode(element);
        //临时节点
        SingleNode temp = head;
        // 找到尾节点
        while (temp.next != null) {
            temp = temp.next;
        }
        // 已经包括了头节点.next为null的情况了～
        temp.next = newNode;
    }

}

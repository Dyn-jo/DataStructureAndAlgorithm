package com.dyn.demo.datastructure.list;

/**
 * 双向链表
 * @param <E>
 */
public class Node<E> {

    E item;

    Node<E> next;

    Node<E> prev;

    Node(E element) {
        this.item = element;
    }

    Node(Node<E> prev, E element, Node<E> next) {
        this.item = element;
        this.prev = prev;
        this.next = next;
    }

}

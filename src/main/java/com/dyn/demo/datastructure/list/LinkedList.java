package com.dyn.demo.datastructure.list;

/**
 * 双向链表
 * @param <T>
 */
public class LinkedList<T> implements List<T> {

    transient Node<T> first;

    transient Node<T> last;

    private int size;

    @Override
    public void add(T t) {
        final Node<T> l = last;
        final Node<T> temp = new Node<>(l, t, null);
        last = temp;
        if (l == null) {
            first = temp;
        } else {
            l.next = temp;
        }
        size++;
    }

    @Override
    public void insert(T t, int index) {
        // 获取index的节点
        Node<T> temp = getNode(index);
        // 创建新节点
        Node nodeNew = new Node(temp.prev, t, temp);
        temp.prev.next = nodeNew;
        temp.prev = nodeNew;

        size++;
    }

    @Override
    public T remove(int index) {
        // 获取index的节点
        Node<T> temp = getNode(index);
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size--;
        return temp.item;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T get(int index) {
        Node<T> temp = getNode(index);
        return temp.item;
    }

    private Node<T> getNode(int index) {
        Node<T> temp;
        validate(index);
        if (index > size / 2) {
            temp = last;
            for (int i = size - 1; i > index; i--) {
                temp = temp.prev;
            }

        } else {
            temp = first;
            for (int i = 1; i <= index; i++) {
                temp = temp.next;
            }
        }
        return temp;
    }

    @Override
    public void validate(int index) {
        if (index < 0 || index > size - 1) {
            throw new RuntimeException();
        }
    }

    @Override
    public int size() {
        return size;
    }

    public T getFirst() {
        final Node<T> f = first;
        if (f == null) {
            throw new RuntimeException();
        }
        return f.item;
    }

    public T getLast() {
        final Node<T> f = last;
        if (f == null) {
            throw new RuntimeException();
        }
        return f.item;
    }

}

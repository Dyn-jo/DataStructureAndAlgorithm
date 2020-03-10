package com.dyn.demo.datastructure.list;

public class Stack<T> implements List<T> {

    private Node<T> top;

    private Node<T> bottom;

    private int size;

    public Stack() {
    }

    public Stack(Node top, Node bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    @Override
    public void add(Object o) {
        Node<T> t = top;
        Node<T> newNode = new Node(null, o, t);

        top = newNode;
        if (t == null) {
            bottom = newNode;

        } else {
            t.prev = newNode;
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
        Node<T> node = getNode(index);

        return node.item;
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

    public T getTop() {
        final Node<T> f = top;
        if (f == null) {
            throw new RuntimeException();
        }
        return f.item;
    }

    public T getBottom() {
        final Node<T> f = bottom;
        if (f == null) {
            throw new RuntimeException();
        }
        return f.item;
    }

    private Node<T> getNode(int index) {
        Node<T> temp;
        validate(index);
        if (index > size / 2) {
            temp = top;
            for (int i = size - 1; i > index; i--) {
                temp = temp.next;
            }

        } else {
            temp = bottom;
            for (int i = 1; i <= index; i++) {
                temp = temp.prev;
            }
        }
        return temp;
    }

}

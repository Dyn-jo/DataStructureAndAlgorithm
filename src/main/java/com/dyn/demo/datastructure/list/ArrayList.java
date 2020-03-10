package com.dyn.demo.datastructure.list;

import java.util.Arrays;

/**
 * 顺序线性表
 * 底层由数组实现，存取速度快（通过下标直接获取），插入删除慢（需要扩容缩容）
 * @param <T>
 */
public class ArrayList<T> implements List<T> {

    public Object[] objects = {};

    private int size;

    public ArrayList() {
    }

    public ArrayList(int len) {
        objects = new Object[len];
    }

    @Override
    public void add(T t) {
        size++;
        objects = Arrays.copyOf(objects, size);
        objects[size - 1] = t;
    }

    public void insert(T t, int index) {
        if (index < 0 || index > size) {
            throw new RuntimeException();
        }

        size++;
        objects = Arrays.copyOf(objects, size + 1);
        System.arraycopy(objects, index, objects, index + 1,
                size - index - 1);
        objects[index] = t;
    }

    public T remove(int index) {
        validate(index);
        T t = (T) objects[index];
        System.arraycopy(objects, index + 1, objects, index,
                size - index - 1);
        size--;
        objects = Arrays.copyOf(objects, size);
        return t;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T get(int index) {
        validate(index);
        return (T) objects[index];

    }

    public void validate(int index) {
        if (index < 0 || index > size - 1) {
            throw new RuntimeException();
        }
    }

    public int size() {
        return size;
    }

}

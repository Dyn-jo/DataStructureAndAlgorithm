package com.dyn.demo.datastructure.list;

public interface List<T> {

    public void add(T t);

    public void insert(T t, int index);

    public T remove(int index);

    public boolean isEmpty();

    public T get(int index);

    public void validate(int index);

    public int size();

}

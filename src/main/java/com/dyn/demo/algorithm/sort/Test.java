package com.dyn.demo.algorithm.sort;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * a.length * 10);
        }
        System.out.println(Arrays.toString(a));

//        Bubble.bubbleSort(a);
//        Insert.insertSort(a);
//        Select.selectSort(a);

//        Heap.heapSort(a);
//        Quick.quickSort(a, 0, a.length - 1);

        sort(a);
        System.out.println(Arrays.toString(a));

    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void sort(int[] a) {
        int pivot = 50;
        if (a.length < pivot) {
            Insert.insertSort(a);
        } else {
            Quick.quickSort(a, 0, a.length - 1);
        }
    }

}

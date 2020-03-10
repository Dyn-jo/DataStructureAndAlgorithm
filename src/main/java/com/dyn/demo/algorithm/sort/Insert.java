package com.dyn.demo.algorithm.sort;

/**
 * 插入排序（打扑克原理）
 *
 * 左边数据当做有序，右侧当做无序
 * 第一轮，与左侧数据比较，当小于左侧数据时，交换位置
 * 以此类推
 */
public class Insert {

    public static void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = i;
            for (int j = i - 1; j >= 0; j--) {
                if (a[temp] < a[j]) {
                    Test.swap(a, j, temp);
                    temp = j;
                }
            }
        }
    }

}


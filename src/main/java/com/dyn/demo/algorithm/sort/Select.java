package com.dyn.demo.algorithm.sort;

/**
 * 选择排序
 *
 * 第一轮，找到所有数中的最小值，放在第一个位置
 * 第二轮，找到除去第一个之外的最小值，放在第二个位置
 * 以此类推
 */
public class Select {

    public static void selectSort(int[] a) {
        // i=0， 第一轮比较，备份第一个数，下标为i，假设当前数为最小值
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            if (min != i) {
                Test.swap(a, i, min);
            }
        }
    }

}


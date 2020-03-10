package com.dyn.demo.algorithm.sort;

/**
 * 冒泡排序
 *
 * 每一轮，前一个数和后一个数比，若是前数大，则交换位置，第一轮找出最大值放在末尾，下一轮不参与比较
 * 以此类推
 */
public class Bubble {

    public static void bubbleSort(int[] a) {

        for (int i = 1; i < a.length; i++) {

            // 优化，增加flag，若当前轮数未出现交换，则证明此时数组已经排序结束
            boolean flag = true;

            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    Test.swap(a, j, j + 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }

}


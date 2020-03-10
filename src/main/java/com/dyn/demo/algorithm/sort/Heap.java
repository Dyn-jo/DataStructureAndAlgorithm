package com.dyn.demo.algorithm.sort;

/**
 * 堆排序
 *
 * 构建大顶堆
 * 将堆顶（即最大值）与末尾元素交换，则数组最大值已确定
 * 除去末尾值重新构建大顶堆
 * 以此类推
 */
public class Heap {

    public static void heapSort(int[] a) {
        int len = a.length;
        // 所有非叶子节点进行大顶堆的构建，从下至上
        for (int i = (len - 2) / 2; i >= 0; i--) {
            adjustHeap(a, i, len);
        }
        for (int i = len - 1; i > 0; i--) {
            Test.swap(a, i, 0);
            adjustHeap(a, 0, i);
        }
    }

    /**
     * 构建大顶堆
     * @param a
     */
    private static void adjustHeap(int[] a, int i, int len) {
        // 备份当前节点
        int temp = a[i];
        // 从左至右，找到当前节点的左孩子
        for (int j = i * 2 + 1; j < len; j = j * 2 + 1) {
            // 左孩子与右孩子比较，找到最大值
            if (j + 1 < len && a[j] < a[j + 1]) {
                j++;
            }
            // 父节点值更大
            if (temp >= a[j]) {
                break;
            }
            // 子节点值更大，与子节点交换
            else {
                a[i] = a[j];
                i = j;
            }
        }
        a[i] = temp;
    }

}


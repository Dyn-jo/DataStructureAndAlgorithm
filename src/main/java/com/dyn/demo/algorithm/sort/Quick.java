package com.dyn.demo.algorithm.sort;

public class Quick {

    public static void quickSort(int[] a, int left, int right) {
        if (left < right) {
            // 使用分治法策略来把一个串行（list）分为两个子串行（sub-lists）
            int meetting = partition(a, left, right);
            quickSort(a, 0, meetting - 1);
            quickSort(a, meetting + 1, right);
        }
    }

    /**
     * i<j
     * j从右侧开始，找到比基准值小的数时，停止
     * i从左侧开始，找到比基准值大的数停止，交换i与j的值
     * 继续寻找，直至相遇，相遇位置与基准值进行交换
     */
    private static int partition(int[] a, int left, int right) {
        // 优化，通常取第一个数为基准值，若该数过大或过小，增加算法复杂度，取首尾中间三数的中间值作为基准，更为合适
        setBase(a, left, right);

        int temp = a[left];
        while (left < right) {
            while (left < right && a[right] >= temp) {
                right--;
            }
            a[left] = a[right];
            while (left < right && a[left] <= temp) {
                left++;
            }
            a[right] = a[left];
        }
        a[left] = temp;
        return left;
    }

    // 三数取中，设置基准值，在第一个位置
    public static void setBase(int[] a, int left, int right) {
        int mid = (left + right) / 2;
        if (a[mid] > a[right]) {
            Test.swap(a, mid, right);
        }
        if (a[left] > a[right]) {
            Test.swap(a, left, right);
        }
        if (a[mid] > a[left]) {
            Test.swap(a, left, mid);
        }
    }

}



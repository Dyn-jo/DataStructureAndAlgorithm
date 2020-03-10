package com.dyn.demo.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 算法
 */
public class Test1 {

    public static void main(String[] args) {
//        int j = 0;
//        for (int i = 2; i <= 100; i++) {
//            if (isPrime(i)) {
//                j++;
//                System.out.println(i);
//            }
//        }
//        System.out.println("素数的个数为：" + j);

//        test2();
        List list= new ArrayList(5);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
    }

    /**
     * 1.求100以内的素数（质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数。）
     */
    public static boolean isPrime(int num) {

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 2.打印水仙花数
     * 153=1^3+5^3+3^3
     */
    public static void test2() {
        for (int a = 100; a < 100000; a++) {
            //1.计算数字长度
            int len = 1;
            int c = 0;
            for (int i = 10; ; i = i * 10) {
                c = a / i;
                if (c == 0) {
                    break;
                }
                {
                    len++;
                }
            }
            int sum = 0;
            for (int i = len - 1; i >= 0; i--) {
                int b = (int) (a / (Math.pow(10, i))) % 10;
                sum += Math.pow(b, len);
            }
            if (a == sum) {
                System.out.println(a + "为水仙花数字");
            }
        }

    }

}

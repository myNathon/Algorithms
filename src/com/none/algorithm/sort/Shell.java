package com.none.algorithm.sort;

import static com.none.tool.StdOut.print;
import static com.none.tool.StdOut.println;

/**
 * 希尔排序(shell sort)
 * Created by Nathon on 2017/8/17.
 */
public class Shell {
    /**
     * 基于插入算法实现希尔排序
     * 希尔排序(shell sort): 对于任意以1结尾的h序列，都能将数组排序
     * 下面算法实现使用序列: 1/2(3^n-1)
     * @param arr 对象数组
     */
    public static void sort(Comparable[] arr) {
        int len = arr.length;

        int d = 1;
        while(d < len/3) {
            d = d*3 + 1;
        }

        while(d >= 1) {
            for(int i = d; i < len; i++) {  // distance is d
                for(int j = i; j >= d && (less(arr[j], arr[j-d])); j -= d) {
                    exch(arr, j, j-d);
                }
            }

            d /= 3;
        }
    }

    /**
     * 两个对象比较，自定义数据类型需要实现compareTo接口
     * @param v 其一对象
     * @param w 另一对象
     * @return  "v < w" 返回true，其他false
     */
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * 交换对象数组中的两个元素
     * @param arr 对象数组
     * @param i   对象数组中的一个下标
     * @param j   对象数组中的一个下标
     */
    private static void exch(Comparable[] arr, int i, int j) {
        Comparable tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**
     * 打印对象数
     * @param arr 对象数组
     */
    public static void show(Comparable[] arr) {
        for(Comparable a: arr) {
            print(a + " ");
        }
        println();
    }

    /**
     * 希尔排序是升序排序，所以这里判断是否为升序排序，主要用于判断是否排序成功
     * @param arr 对象数组
     * @return    对象数组符合升序则返回true，否则返回false
     */
    public static boolean isSorted(Comparable[] arr) {
        int len = arr.length;
        for(int i = 1; i < len; i++) {
            if(less(arr[i], arr[i-1])) {
                return false;
            }
        }

        return true;
    }
}

package com.none.algorithm.sort;

import static com.none.tool.StdOut.print;
import static com.none.tool.StdOut.println;

/**
 * 三向切分快速排序（排序效果最优）
 * 针对数组元素重复个数比较多的情况
 * Created by Nathon on 2017/8/19.
 */
public class Quick3way {
    /**
     * 三向切分快速排序的实现
     * 三分：小于，等于，大于[实现需要三个标识符]
     * @param arr 对象数组
     */
    public static void sort(Comparable[] arr) {
        // 前提可以将数组元素顺序打乱，防止快速排序最坏情况的出现，这里没有做打乱处理
        sort(arr, 0, arr.length-1);
    }

    /**
     * 三切分数组快速排序递归实现[注意点：控制数组下标越界问题]
     * @param arr 对象数组
     * @param lo  对象数组相对左下标
     * @param hi  对象数组相对右下标
     */
    private static void sort(Comparable[] arr, int lo, int hi) {
        // 这里可以切换插入数组优化，原因小长度插入排序优于快速排序
        // hi <= lo + M，M根据实际环境决定数值
        if(hi <= lo) {
            return ;
        }

        int lt = lo;    // 相等参考值部分的起始下标值
        int m = lo + 1; // 移动下标值
        int gt = hi;    // 大于参考值的下标值
        Comparable flag = arr[lo];  // 比较参考值
        while(m <= gt) {
            int r = compare(arr[m], flag);
            switch(r) {
                case 1:         // arr[m] > flag
                    exch(arr, m, gt--);
                    break;
                case 0:         // arr[m] == flag
                    m++;
                    break;
                case -1:        // arr[m] < flag
                    exch(arr, m++, lt++);
                    break;
            }
        }

        // 注意大于参考值部分数组的左下标值
        sort(arr, lo, lt-1);
        sort(arr, gt+1, hi);
    }

    private static int compare(Comparable v, Comparable w) {
        return v.compareTo(w);
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] arr, int i, int j) {
        Comparable tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void show(Comparable[] arr) {
        for(Comparable a: arr) {
            print(a + " ");
        }
        println();
    }

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


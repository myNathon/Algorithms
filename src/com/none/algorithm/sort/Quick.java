package com.none.algorithm.sort;

import static com.none.tool.StdOut.print;
import static com.none.tool.StdOut.println;

/**
 * 快速排序(quick sort)
 * Created by Nathon on 2017/8/19.
 */
public class Quick {
    /**
     * 快速排序的实现
     * @param arr 对象数组
     */
    public static void sort(Comparable[] arr) {
        // 前提可以将数组元素顺序打乱，防止快速排序最坏情况的出现，这里没有做打乱处理
        sort(arr, 0, arr.length-1);
    }

    /**
     * 实现递归调用
     * @param arr 对象数组
     * @param lo  对象数组相对左下标
     * @param hi  对象数组相对右下标
     */
    private static void sort(Comparable[] arr, int lo, int hi) {
        if(hi <= lo) {  // 递归记得结束条件，不然死循环
            return ;
        }

        int d = partition(arr, lo, hi);
        sort(arr, lo, d-1);
        sort(arr, d+1, hi);
    }

    /**
     * 快速排序中切分数组[注意点：控制数组下标越界问题]
     * @param arr 对象数组
     * @param lo  切分数组的左下标
     * @param hi  切分数组的右下标
     * @return    已排序的元素下标
     */
    private static int partition(Comparable[] arr, int lo, int hi) {
        int l = lo;
        int r = hi + 1;

        // 使用"l < r"条件也能实现循环，但感觉使用"true"更好
        while(true) {
            while(less(arr[++l], arr[lo]) && (l != hi)) {} // 空循环体

            while(less(arr[lo], arr[--r]) && (r != lo)) {} // 空循环体

            if(l >= r) {
                break;
            }

            exch(arr, l, r);
        }

        exch(arr, lo, r);

        return r;
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

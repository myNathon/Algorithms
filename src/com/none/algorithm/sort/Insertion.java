package com.none.algorithm.sort;

import static com.none.tool.StdOut.print;
import static com.none.tool.StdOut.println;

/**
 * 插入排序
 * Created by Nathon on 2017/8/17.
 */
public class Insertion {
    /**
     * 插入算法实现
     * @param arr 对象数组
     */
    public static void sort(Comparable[] arr) {
        int len = arr.length;
        for(int i = 1; i < len; i++) {
            for(int j = i; j > 0 && less(arr[j], arr[j-1]); j--) {
                exch(arr, j, j-1);
            }
        }
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

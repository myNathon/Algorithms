package com.none.algorithm.sort;

import static com.none.tool.StdOut.print;
import static com.none.tool.StdOut.println;

/**
 * 归并排序(merge sort)（自底向上）
 * Created by Nathon on 2017/8/17.
 */
public class MergeBU {
    // Auxiliary array
    private static Comparable[] aux;

    /**
     * 归并排序实现（自底向上）
     * @param arr 对象数组
     */
    public static void sort(Comparable[] arr) {
        int len = arr.length;
        aux = new Comparable[len];

        for(int sz = 1; sz < len; sz *= 2) {
            for(int l = 0; l < len - sz; l += 2*sz) {
                merge(arr, l, l+sz-1, Math.min(l+2*sz-1, len-1));
            }
        }
    }

    /**
     * 合并两个有序数组
     * @param arr 对象数组
     * @param lo  最左下标值
     * @param mid 中间下标值
     * @param hi  最右下标值
     */
    private static void merge(Comparable[] arr, int lo, int mid, int hi) {
        int l = lo;
        int r = mid + 1;

        // copy arr[lo...hi] to aux[lo...hi]
        System.arraycopy(arr, lo, aux, lo, hi-lo+1);

        for(int n = l; n <= hi; n++) {
            if(r > hi) {
                arr[n] = aux[l++];
            } else if(l > mid) {
                arr[n] = aux[r++];
            } else if(less(aux[r], aux[l])) { // 注意这句判断之前的判断
                arr[n] = aux[r++];
            } else {
                arr[n] = aux[l++];
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

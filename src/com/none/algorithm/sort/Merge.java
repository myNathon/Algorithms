package com.none.algorithm.sort;

import static com.none.tool.StdOut.print;
import static com.none.tool.StdOut.println;

/**
 * 归并算法(merge sort)（自顶向下）
 * Created by Nathon on 2017/8/17.
 */
public class Merge {
    // Auxiliary array
    private static Comparable[] aux;

    /**
     * 归并算法实现（自顶向下）
     * @param arr 对象数组
     */
    public static void sort(Comparable[] arr) {
        // 创建辅助数组对象
        // 但不要将原数组拷贝到这个数组，留在merge方法中拷贝
        // 这里拷贝，不能保持与排过序的数组数据一致
        int len = arr.length;
        aux = new Comparable[len];
//        System.arraycopy(arr, 0, aux, 0, len);

        // sort overloading
        sort(arr, 0, len-1);
    }

    /**
     * 排序方法sort重载
     * @param arr 对象数组
     * @param lo  最左下标值
     * @param hi  最右下标值
     */
    private static void sort(Comparable[] arr, int lo, int hi) {
        if(lo >= hi) {
            return;
        }

        int mid = lo + (hi - lo) / 2;
        sort(arr, lo, mid);
        sort(arr, mid+1, hi);
        merge(arr, lo, mid, hi);
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

        // 不要忘记备份数据到辅助数组中
        System.arraycopy(arr, lo, aux, lo, hi-lo+1);

        for(int n = l; n <= hi; n++) {
            if(l > mid) {
                arr[n] = aux[r++];
            } else if(r > hi) {
                arr[n] = aux[l++];
            } else if(less(aux[l], aux[r])) {
                arr[n] = aux[l++];
            } else {
                arr[n] = aux[r++];
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

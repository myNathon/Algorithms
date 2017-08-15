package com.none.algorithm.search;

/**
 * Created by Nathon on 2017/8/15.
 */
public class BinarySearch {
    /**
     * 针对有序整数数组二分查找
     * @param key  需要查找目标值
     * @param arr  整数数组
     * @return     找到则返回数组对应下标，否则返回-1
     */
    public static int rank(int key, int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;

        while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if(arr[mid] > key) { hi = mid - 1; }
            else if(arr[mid] < key) { lo = mid + 1; }
            else { return mid; }
        }

        return -1;
    }

    /**
     * test
     * @param args
     */
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(rank(1, a));
        System.out.println(rank(5, a));
        System.out.println(rank(10, a));
        System.out.println(rank(0, a));
        System.out.println(rank(11, a));
        System.out.println(rank(100, a));
    }
}
